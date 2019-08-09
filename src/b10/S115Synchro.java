package b10;

public class S115Synchro {
    public static void main(String[] args) {
        S115Synchro syn = new S115Synchro();

        Thread[] threads = { //
                new Thread(new RunnerF(syn)), //
                new Thread(new RunnerF(syn)), //
                new Thread(new RunnerG(syn)), //
                new Thread(new RunnerF2(syn)), //
                new Thread(new RunnerF2(syn)), //
                new Thread(new RunnerG2(syn)) //
        };

        for (Thread t : threads) {
            t.start();
        }

        System.out.println("Main thread done");

    }

    private Object mutexF = new Object();
    private Object mutexG = new Object();

    public synchronized void f() {
        System.out.println("Enter f() for " + Thread.currentThread().getName());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exit f() for " + Thread.currentThread().getName());
    }

    public synchronized void g() {
        System.out.println("Enter g() for " + Thread.currentThread().getName());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exit g() for " + Thread.currentThread().getName());
    }

    public void f2() {
        System.out.println("Enter f2() for " + Thread.currentThread().getName());

        synchronized (mutexF) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Exit f2() for " + Thread.currentThread().getName());
    }

    public void g2() {
        System.out.println("Enter g2() for " + Thread.currentThread().getName());

        synchronized (mutexG) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Exit g2() for " + Thread.currentThread().getName());
    }
}

class RunnerF implements Runnable {
    private S115Synchro synchro;

    public RunnerF(S115Synchro synchro) {
        this.synchro = synchro;
    }

    @Override
    public void run() {
        synchro.f();
    }
}

class RunnerG implements Runnable {
    private S115Synchro synchro;

    public RunnerG(S115Synchro synchro) {
        this.synchro = synchro;
    }

    @Override
    public void run() {
        synchro.g();
    }
}

class RunnerF2 implements Runnable {
    private S115Synchro synchro;

    public RunnerF2(S115Synchro synchro) {
        this.synchro = synchro;
    }

    @Override
    public void run() {
        synchro.f2();
    }
}

class RunnerG2 implements Runnable {
    private S115Synchro synchro;

    public RunnerG2(S115Synchro synchro) {
        this.synchro = synchro;
    }

    @Override
    public void run() {
        synchro.g2();
    }
}
