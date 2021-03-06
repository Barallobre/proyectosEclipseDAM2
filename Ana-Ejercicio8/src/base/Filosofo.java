package base;

import java.util.concurrent.Semaphore;
import java.util.Date;

public class Filosofo extends Thread {
	boolean palillos_cogidos;
	Palillo pal_derecha;
	Palillo pal_izquierda;
	Integer id;

	static Semaphore semaforo = new Semaphore(1);

	Filosofo(Palillo pal_derecha, Palillo pal_izquierda, Integer id) {
		this.pal_derecha = pal_derecha;
		this.pal_izquierda = pal_izquierda;
		this.id = id;
		this.palillos_cogidos = false;
	}

	public void run() {
		while (true) {
			// Bucle para seguir intentando coger los palillos hasta que se consiga
			while (this.palillos_cogidos == false) {
				// Bloquear al resto de hilos
				esperar_lock();// semaforo.acquire

				// Intentar coger cada uno de los palillos
				if (this.pal_izquierda.coger()) {// semaforo.tryAcquire()
					if (this.pal_derecha.coger()) {// semaforo.tryAcquire()
						// Salir del bucle para poder comer
						this.palillos_cogidos = true;
					} else {
						// Si no se pudo coger el de la derecha, soltar el de la izquierda
						// para que otro pueda usarlo
						this.pal_izquierda.soltar();// semaforo.release()
					}
				}
				soltar_lock();// semaforo.release
			}

			comer(); // 5 segundos

			// Bloquear el resto de hilos mientras se sueltan los palillos
			esperar_lock();// semaforo.acquire
			this.pal_derecha.soltar(); // semaforo.release
			this.pal_izquierda.soltar();// semaforo.release
			this.palillos_cogidos = false;
			soltar_lock();// semaforo.release

			pensar(); // 5 segundos
		}
	}

// Each acquire() blocks if necessary until a permit is available, and then takes it. 
// Each release() adds a permit, potentially releasing a blocking acquirer.

	private void esperar_lock() {
		try {
			semaforo.acquire();
		} catch (InterruptedException e) {
			System.err.println("Error al esperar el filosofo " + this.id + " : " + e);
		}
	}

	private void soltar_lock() {
		semaforo.release();
	}

	private void comer() {
		try {
			System.out.println((new Date()) + " - Filosofo " + id + " est� comiendo...");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.err.println("Error mientras el filosofo " + id + " come: " + e);
		}
	}

	private void pensar() {
		try {
			System.out.println((new Date()) + " - Filosofo " + id + " est� pensando...");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.err.println("Error mientras el filosofo " + id + " pensando: " + e);
		}
	}
}
