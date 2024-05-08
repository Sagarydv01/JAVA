import java.awt.*;
class Box extends Frame {
    Box ()  {
        Frame frame = new Frame();
        frame.setSize(300, 200);
        frame.setTitle("Box");
        frame.setVisible(true);
        frame.setBackground(Color.GRAY);

        Label name = new Label("Name: ");
        Label sem = new Label("Semester: ");
        name.setBounds(50, 50, 60, 20);
        sem.setBounds(50, 80, 60, 20);

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        textField1.setBounds(120, 50, 150, 20);
        textField2.setBounds(120, 80, 150, 20);

        Button ok = new Button("OK");
        ok.setBounds(100, 120, 60, 20);
        
        Button cancel = new Button("Cancel");
        cancel.setBounds(180, 120, 60, 20); 

        frame.add(name);
        frame.add(sem);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(ok);
        frame.add(cancel);
    }
    public static void main(String[] args) {
        new Box();
    }
}
