package org.viniciusog.patterns.behavioral.memento.swing;

import org.viniciusog.patterns.behavioral.memento.swing.component.TextAreaWithMemory;
import org.viniciusog.patterns.behavioral.memento.swing.component.TextAreaWithMemory.TextAreaMemento;
import org.viniciusog.patterns.behavioral.memento.swing.memory.Caretaker;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Memento");
        frame.setLayout(new BorderLayout());

        JButton previous = new JButton("<<");
        JButton next = new JButton(">>");

        frame.add(previous, BorderLayout.WEST);
        frame.add(next, BorderLayout.EAST);

        // Local de origem dos dados
        TextAreaWithMemory originator = new TextAreaWithMemory(5, 10);
        JScrollPane scroll = new JScrollPane(originator,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        frame.add(scroll, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        JComboBox<String> mementosList = new JComboBox<String>();
        JButton save = new JButton("Save");
        bottomPanel.add(mementosList);
        bottomPanel.add(save);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Using memento pattern:
        Caretaker caretaker = new Caretaker();
        save.addActionListener(e -> {
            caretaker.add(originator.save());
            mementosList.addItem(caretaker.getHistoryList().size() + "");
            mementosList.setSelectedItem(caretaker.getHistoryList().size() + "");
            originator.requestFocusInWindow();
        });

        mementosList.addItemListener(e -> {
            originator.restore((TextAreaMemento) caretaker.get(mementosList.getSelectedIndex()));
            originator.requestFocusInWindow();
        });

        next.addActionListener(e -> {
            if (mementosList.getSelectedIndex() < mementosList.getItemCount() - 1) {
                int nextItem = mementosList.getSelectedIndex() + 1;
                originator.restore((TextAreaMemento) caretaker.get(nextItem));
                mementosList.setSelectedIndex(nextItem);
                originator.requestFocusInWindow();
            }
        });

        previous.addActionListener(e -> {
            if (mementosList.getSelectedIndex() > 0) {
                int previousItem = mementosList.getSelectedIndex() - 1;
                originator.restore((TextAreaMemento) caretaker.get(previousItem));
                mementosList.setSelectedIndex(previousItem);
                originator.requestFocusInWindow();
            }
        });

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
