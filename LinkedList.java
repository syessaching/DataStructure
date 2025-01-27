public class LinkedList<E> {
    Node<E> head;
    int size;

    public LinkedList(){
        head = null;
        size =0;


    }

    public void addNode(E d){
        Node<E> newNode = new Node<E>(d);
        if (head==null){
            head =newNode;
        }else {
            Node current = head;
            while(current.next!=null){
                current=current.next;

            }
            current.next=newNode;
        }
        size++;
    }
    public int size(){
        return  size;
    }

    public int getSize(){
        return size;
    }

    public E get(int index){
        Node <E> current=head;
        for (int i=0; i<index; i++){
            current= current.next;

        }
        return  current.data;
    }
    public void printAll(){
        Node<E> current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public  E removeAt(int index){
        E result = null;
        Node<E> current = head;
        if(index==0){
            result=head.data;
            head= head.next;
        }else{
            for(int i=0; i<index-1; i++){
                current=current.next;
            }
            result =current.next.data;
            current.next = current.next.next;}
        size--;
        return result;
    }

    public void insertAt(int index, E d){
        Node<E> newNode= new Node<E>(d);
        Node<E> current = head;
        size++;
        if(index==0){
            newNode.next=head;
            head=newNode;
        }else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

    }
    public int lookupByName(E name) {
        int index = 0;
        Node<E> current = head;
        while (current != null) {
            if (name.equals(current.data)) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public void push(E data){
        addNode(data);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public E pop(){
        int lastIndex = size-1;
        return removeAt(lastIndex);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public E deque(){
        return removeAt(0);
    }

}
