class TextState {
    String text;
    TextState prev;
    TextState next;

    public TextState(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    TextState head;
    TextState current;
    int size;
    int maxSize;

    public TextEditor(int maxSize) {
        this.head = null;
        this.current = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void addText(String text) {
        TextState node = new TextState(text);
        if (head == null) {
            head = node;
            current = node;
        } 
        else {
            current.next = node;
            node.prev = current;
            current = node;
        }
        size++;
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current.prev == null) {
            System.out.println("Can't undo further");
            return;
        }
        current = current.prev;
    }

    public void redo() {
        if (current.next == null) {
            System.out.println("Can't redo further");
            return;
        }
        current = current.next;
    }

    public void display() {
        System.out.println("Current Text: " + current.text);
    }
}

public class FunctionalTextEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);
        editor.addText("Hello");
        editor.addText("World");
        editor.addText("Java");
        editor.display();
        editor.undo();
        editor.display();
        editor.redo();
        editor.display();
    }
}
