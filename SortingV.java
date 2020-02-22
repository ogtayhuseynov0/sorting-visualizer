
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class SortingV {

	private JFrame frame;
	private JTextField textField;
	public static int[] arr;
	public static JTextPane[] chartArr;
	public JTextPane textPane;
	public JTextPane textPane_1 = new JTextPane();
	public JTextPane textPane_2 = new JTextPane();
	public JTextPane textPane_3 = new JTextPane();
	public JTextPane textPane_4 = new JTextPane();
	public JTextPane textPane_5 = new JTextPane();
	public JTextPane textPane_6 = new JTextPane();
	public JTextPane textPane_7 = new JTextPane();
	public JTextPane textPane_8 = new JTextPane();
	public JTextPane textPane_9 = new JTextPane();

	public static int j = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortingV window = new SortingV();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SortingV() {
		initialize();
	}

	private void initialize() {
		arr = new int[10];
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(20, 16, 316, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(575, 15, 75, 29);
		frame.getContentPane().add(btnSort);

		textPane = new JTextPane();
		textPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane.setForeground(Color.WHITE);
		textPane.setBackground(Color.MAGENTA);
		textPane.setBounds(35, 123, 30, 110);
		frame.getContentPane().add(textPane);

		textPane_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_1.setForeground(Color.WHITE);
		textPane_1.setBackground(Color.MAGENTA);
		textPane_1.setBounds(95, 123, 30, 110);
		frame.getContentPane().add(textPane_1);

		textPane_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_2.setForeground(Color.WHITE);
		textPane_2.setBackground(Color.MAGENTA);
		textPane_2.setBounds(65, 123, 30, 110);
		frame.getContentPane().add(textPane_2);

		textPane_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_3.setForeground(Color.WHITE);
		textPane_3.setBackground(Color.MAGENTA);
		textPane_3.setBounds(125, 123, 30, 110);
		frame.getContentPane().add(textPane_3);

		textPane_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_4.setForeground(Color.WHITE);
		textPane_4.setBackground(Color.MAGENTA);
		textPane_4.setBounds(155, 123, 30, 110);
		frame.getContentPane().add(textPane_4);

		textPane_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_5.setForeground(Color.WHITE);
		textPane_5.setBackground(Color.MAGENTA);
		textPane_5.setBounds(185, 123, 30, 110);
		frame.getContentPane().add(textPane_5);

		textPane_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_6.setForeground(Color.WHITE);
		textPane_6.setBackground(Color.MAGENTA);
		textPane_6.setBounds(215, 123, 30, 110);
		frame.getContentPane().add(textPane_6);

		textPane_7.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_7.setForeground(Color.WHITE);
		textPane_7.setBackground(Color.MAGENTA);
		textPane_7.setBounds(245, 123, 30, 110);
		frame.getContentPane().add(textPane_7);

		textPane_8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_8.setForeground(Color.WHITE);
		textPane_8.setBackground(Color.MAGENTA);
		textPane_8.setBounds(275, 123, 30, 110);
		frame.getContentPane().add(textPane_8);

		textPane_9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		textPane_9.setForeground(Color.WHITE);
		textPane_9.setBackground(Color.MAGENTA);
		textPane_9.setBounds(305, 123, 30, 110);
		frame.getContentPane().add(textPane_9);

		chartArr = new JTextPane[] { textPane, textPane_1, textPane_2, textPane_3, textPane_4, textPane_5, textPane_6,
				textPane_7, textPane_8, textPane_9 };

		JButton btnVisualize = new JButton("Visualize");
		btnVisualize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visualizer(chartArr, stringToInt(textField.getText()));
			}
		});

		final int[] arr = generateRandomArray();
		textField.setText(joinArray(arr));
		visualizer(chartArr, arr);

		btnVisualize.setBounds(478, 15, 100, 29);
		frame.getContentPane().add(btnVisualize);

		JButton btnRandomArray = new JButton("Random Array");
		btnRandomArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] arr2 = generateRandomArray();
				// arr = arr2;
				updateArray(arr2);
				visualizer(chartArr, arr2);
				textField.setText(joinArray(arr2));
			}
		});
		btnRandomArray.setBounds(341, 17, 133, 29);
		frame.getContentPane().add(btnRandomArray);
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectionSort(arr, chartArr);
			}
		});
	}

	/*
	 * Following part is only for extra functions and methods
	 */
	// following function is for finding elemet in array
	public static boolean find(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	// following function generates random array
	public static int[] generateRandomArray() {
		Random rand = new Random();

		int[] randomArr = new int[10];
		for (int i = 0; i < randomArr.length; i++) {
			int randomNum;
			do {
				randomNum = rand.nextInt((50 - 1) + 1) + 1;
			} while (find(randomArr, randomNum));
			randomArr[i] = randomNum;
		}
		return randomArr;
	}

	// Following function joins array
	public static String joinArray(int[] arr) {
		String textData = "";

		for (int i = 0; i < arr.length; i++) {
			textData += arr[i];
			if (i != arr.length - 1) {
				textData += ", ";
			}
		}
		return textData;
	}

	// following method visualizes
	public static void visualizer(JTextPane[] chartArr, int[] arr) {
		int preorder = 35;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				chartArr[i].setBounds(preorder, chartArr[i].getY(), chartArr[i].getWidth(), 0);
			} else {
				chartArr[i].setEditable(false);
				chartArr[i].setBounds(preorder, chartArr[i].getY(), chartArr[i].getWidth(), (arr[i] * 2 + 20));
				chartArr[i].setText(Integer.toString(arr[i]));
				preorder += 30;
			}

		}
	}

	// following function converts string to integer array
	public static int[] stringToInt(String s) {

		s = s.replaceAll(" ", "");
		String[] data = s.split(",");
		if (findString(data, "0")) {
			JOptionPane.showMessageDialog(null, "The range must be between 1 to 50", "Range Error", 0);
		}
		if (data.length == 1) {
			JOptionPane.showMessageDialog(null, "Length of array should be more than 1", "Length Error", 0);
		}
		int[] arr = new int[10];
		for (int i = 0; i < data.length; i++) {
			arr[i] = Integer.parseInt(data[i]);
		}
		return arr;
	}

	// following function finds string inside array
	public static boolean findString(String[] s, String lookingFor) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(lookingFor)) {
				return true;
			}
		}
		return false;
	}

	// this is for selection sort
	static Swap s = new Swap();
	public static int cunt=0;
	public static void selectionSort(final int[] arr, final JTextPane[] chartArr) {
//
//		for (int j = 0; j < arr.length; j++) {
//			for (int j2 = 0; j2 < arr.length - 1; j2++) {
//
//				if (arr[j2] > arr[j2 + 1]) {
//
//					s = new Swap(chartArr[j2], chartArr[j2 + 1]);
//					int tmp = arr[j2 + 1];
//					arr[j2 + 1] = arr[j2];
//					arr[j2] = tmp;
//
//					JTextPane temp = chartArr[j2 + 1];
//					chartArr[j2 + 1] = chartArr[j2];
//					chartArr[j2] = temp;
//
//				}
//
//			}
//		}
		
		new Thread(){
			
			public void run(){
				try {

					for (int j = 0; j < arr.length; j++) {
						for (int j2 = 0; j2 < arr.length - 1; j2++) {
			
							if (arr[j2] > arr[j2 + 1]) {
								Thread.sleep(2000);
								s = new Swap(chartArr[j2], chartArr[j2 + 1]);
								int tmp = arr[j2 + 1];
								arr[j2 + 1] = arr[j2];
								arr[j2] = tmp;
			
								JTextPane temp = chartArr[j2 + 1];
								chartArr[j2 + 1] = chartArr[j2];
								chartArr[j2] = temp;
			
							}
			
						}
					}
					
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}.start();

	}

	public static void updateArray(int[] ar) {
		arr = ar;
	}

	public static void swap(int a, int b) {
	}
}