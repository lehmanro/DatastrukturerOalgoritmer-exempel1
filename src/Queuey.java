public class Queuey {

    Node front, rear;

    private static class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    public void enqueue(String value) {
        Node n = new Node(value);
        if (front == null) {//Kön är tom
            front = n;
            rear = n;
        }else {
            rear.next = n;
            rear = n;
        }
        printQueue();
    }
    public String dequeue() {
        String ret;
        ret = front.value;
        front = front.next;
        printQueue();
        return ret;
    }

    public void printQueue() {
        System.out.println("Queue: ");
        Node n = front;
        while (n != null) {
            System.out.println(n.value + " ");
            n = n.next;
        }
        System.out.println("");
    }

    void temp() {

        String[] circ = {null, null, null};

        circ[0] = "foo"; //{"foo", null, null}
        circ[2] = "bar"; //{"foo", null, "bar"}
    }
    }




