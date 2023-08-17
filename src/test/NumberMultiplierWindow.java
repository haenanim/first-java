package test;

import javax.swing.*;

public class NumberMultiplierWindow extends JFrame {
  private JTextField inputField;
  private JButton multiplyButton;

  public NumberMultiplierWindow() {
    initUI();
  }

  private void initUI() {
    // 윈도우 설정
    setTitle("Number Multiplier");
    setSize(300, 150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(null);

    // 입력 필드
    inputField = new JTextField();
    inputField.setBounds(30, 30, 150, 30);
    add(inputField);

    // 곱하기 버튼
    multiplyButton = new JButton("Multiply by 2");
    multiplyButton.setBounds(30, 70, 150, 30);
    multiplyButton.addActionListener(e -> multiplyByTwo());
    add(multiplyButton);
  }

  private void multiplyByTwo() {
    try {
      String inputText = inputField.getText();
      int number = Integer.parseInt(inputText);
      int result = number * 2;
      JOptionPane.showMessageDialog(this, "결과: " + result);
    } catch (NumberFormatException ex) {
      JOptionPane.showMessageDialog(this, "올바른 숫자를 입력해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      NumberMultiplierWindow window = new NumberMultiplierWindow();
      window.setVisible(true);
    });
  }
}
