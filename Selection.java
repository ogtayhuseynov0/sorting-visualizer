
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Selection {

	private JFrame frame;
	private JTextField textField;
	public static int[] arr;
	public static char[] charArr = { 0 };
	public static String[] stringArr;
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

	public static JComboBox comboBoxSort = new JComboBox();
	public static JComboBox comboBoxRandomArray = new JComboBox();
	public static JButton btnVisualize = new JButton("Visualize");

	public static int j = 0;

	public static boolean isChar = false;
	public static boolean isString = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selection window = new Selection();
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
	public Selection() {
		initialize();
	}

	private void initialize() {
		arr = new int[10];
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 711, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(6, 14, 316, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

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

		btnVisualize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] data = textField.getText().split(",");
				if (isNumeric(data[0])) {
					isChar = false;
					visualizer(chartArr, stringToInt(textField.getText()));
					System.out.println("works");
				} else if (!isNumeric(data[0]) && data[0].length() == 1) {
					isChar = true;
					visualizer(chartArr, stringToChar(textField.getText()));
				} else {
					isString = true;
					stringArr = null;
					stringArr = stringToString(textField.getText());
					visualizer(chartArr, stringToString(textField.getText()));
				}
			}
		});

		arr = generateRandomIntArray();

		textField.setText(joinArray(arr));
		visualizer(chartArr, arr);

		btnVisualize.setBounds(450, 15, 100, 29);
		frame.getContentPane().add(btnVisualize);

		comboBoxSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBoxSort) {
					JComboBox cb = (JComboBox) e.getSource();
					String selectionOption = (String) cb.getSelectedItem();
					switch (selectionOption) {
					case "Bubble Sort":
						if (!isChar && !isString) {
							arr = stringToInt(textField.getText());
							visualizer(chartArr, arr);
							bubbleSort(arr, chartArr);
						} else if (isChar && !isString) {
							charArr = stringToChar(textField.getText());
							visualizer(chartArr, charArr);
							bubbleSort(charArr, chartArr);
						}
						break;
					case "Selection Sort":
						if (!isChar && !isString) {
							arr = stringToInt(textField.getText());
							visualizer(chartArr, arr);
							selectionSort(arr, chartArr);
						} else if (isChar && !isString) {
							charArr = stringToChar(textField.getText());
							visualizer(chartArr, charArr);
							selectionSort(charArr, chartArr);
						}
						break;
					case "Insertion Sort":
						if (!isChar && !isString) {
							arr = stringToInt(textField.getText());
							visualizer(chartArr, arr);
							insertionSort(arr, chartArr);
						} else if (isChar && !isString) {
							charArr = stringToChar(textField.getText());
							visualizer(chartArr, charArr);
							insertionSort(charArr, chartArr);
						}
						break;
					case "Merge Sort":
						if (!isChar && !isString) {
							arr = stringToInt(textField.getText());
							visualizer(chartArr, arr);
							mergeSort(arr, chartArr);
						} else if (isChar && !isString) {
							charArr = stringToChar(textField.getText());
							visualizer(chartArr, charArr);
							
						}
						break;
					}
				}
			}
		});
		comboBoxSort.setModel(new DefaultComboBoxModel(new String[] { "Choose Sorting Algorithm", "Bubble Sort",
				"Selection Sort", "Insertion Sort", "Merge Sort" }));
		comboBoxSort.setBounds(548, 16, 135, 27);
		frame.getContentPane().add(comboBoxSort);
		comboBoxRandomArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBoxRandomArray) {
					JComboBox cb = (JComboBox) e.getSource();
					String randomOption = (String) cb.getSelectedItem();
					switch (randomOption) {
					case "Integer Array":
						isChar = false;
						arr = generateRandomIntArray();
						visualizer(chartArr, arr);
						textField.setText(joinArray(arr));
						break;
					case "Char Array":
						isChar = true;
						charArr = generateRandomCharArray();
						visualizer(chartArr, charArr);
						textField.setText(joinArray(charArr));
						break;
					case "String Array":
						isChar = false;
						stringArr = generateRandomStringArray();
						visualizer(chartArr, stringArr);
						textField.setText(joinArray(stringArr));
						break;
					}
				}
			}
		});
		comboBoxRandomArray.setModel(new DefaultComboBoxModel(
				new String[] { "Random Array", "Integer Array", "Char Array", "String Array" }));
		comboBoxRandomArray.setBounds(321, 16, 135, 27);

		frame.getContentPane().add(comboBoxRandomArray);
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

	// following function is for finding elemet in array
	public static boolean find(char[] arr, char x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	// following function generates random integer array
	public static int[] generateRandomIntArray() {
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

	// following function generates random char array
	public static char[] generateRandomCharArray() {
		Random rand = new Random();
		char[] randomArr = new char[10];
		for (int i = 0; i < randomArr.length; i++) {
			int randomNum;
			do {
				randomNum = rand.nextInt((122 - 97) + 1) + 97;
			} while (find(randomArr, (char) randomNum));
			randomArr[i] = (char) randomNum;
		}
		return randomArr;
	}

	// following function generates rnadom String array
	public static String[] generateRandomStringArray() {
		String[] s = new String[10];
		for (int i = 0; i < s.length; i++) {
			s[i] = stringGenerate();
		}
		return s;
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

	// Following function joins chararray
	public static String joinArray(char[] arr) {
		String textData = "";

		for (int i = 0; i < arr.length; i++) {
			textData += (char) arr[i];
			if (i != arr.length - 1) {
				textData += ", ";
			}
		}
		return textData;
	}

	// Following function joins string array
	public static String joinArray(String[] arr) {
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
			chartArr[i].setBackground(Color.magenta);
		}
	}

	// following method visualizes char array
	public static void visualizer(JTextPane[] chartArr, char[] charArr) {
		int preorder = 35;
		for (int i = 0; i < charArr.length; i++) {

			if (charArr[i] == 0) {
				chartArr[i].setBounds(preorder, chartArr[i].getY(), chartArr[i].getWidth(), 0);
			} else {
				chartArr[i].setEditable(false);
				chartArr[i].setBounds(preorder, chartArr[i].getY(), chartArr[i].getWidth(), (int) charArr[i]);
				chartArr[i].setText(Character.toString((char) charArr[i]));
				preorder += 30;
			}
			chartArr[i].setBackground(Color.magenta);
		}
	}

	// following method visualizes char array
	public static void visualizer(JTextPane[] chartArr, String[] strArr) {
		int preorder = 35;
		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i] == null) {
				chartArr[i].setBounds(preorder, chartArr[i].getY(), chartArr[i].getWidth(), 0);
			} else {
				chartArr[i].setEditable(false);
				chartArr[i].setBounds(preorder, chartArr[i].getY(), chartArr[i].getWidth(), 50);
				chartArr[i].setText(strArr[i]);
				preorder += 30;
			}
			chartArr[i].setBackground(Color.magenta);
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

	// following function converts string to integer array
	public static char[] stringToChar(String s) {

		s = s.replaceAll(" ", "");
		String[] data = s.split(",");
		char[] charData = new char[10];
		String resultCharData = "ok"; // this is for checking is inside texfield
										// data is char or not

		// following loop adds characters to charData
		for (int i = 0; i < data.length; i++) {
			charData[i] = data[i].charAt(0);
		}
		// following loop checks if characters are between 97 and 122
		for (int i = 0; i < charData.length; i++) {
			if ((int) charData[i] < 97 && (int) charData[i] > 122)
				resultCharData = "error";
		}

		if (findString(data, "error")) {
			JOptionPane.showMessageDialog(null, "The range must be between a to z", "Range Error", 0);
		}
		if (data.length == 1) {
			JOptionPane.showMessageDialog(null, "Length of array should be more than 1", "Length Error", 0);
		}
		char[] charArr = new char[10];
		for (int i = 0; i < data.length; i++) {
			charArr[i] = (char) charData[i];
		}
		return charArr;
	}

	// following function converts string to string array
	public static String[] stringToString(String s) {
		s = s.replaceAll(" ", "");
		String[] data = s.split(",");
		String[] strArr = new String[10];
		for (int i = 0; i < data.length; i++) {
			if (data[i].length() != 2) {
				JOptionPane.showMessageDialog(null, "Length of each string should be 2 characters", "Length Error", 0);
				break;
			}
			else
			{
				strArr[i] = data[i];
			}

		}

		if (data.length <= 1) {
			JOptionPane.showMessageDialog(null, "Length of array should be more than 1", "Length Error", 0);
		}
		return strArr;
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

	/*
	 * Following algorithms are for integer sorting
	 */
	// this is for selection sort
	static Swap s = null;

	public static void bubbleSort(final int[] arr, final JTextPane[] chartArr) {
		new Thread() {

			public void run() {
				try {
					hideUI();
					for (int j = 0; j < arr.length; j++) {
						for (int j2 = 0; j2 < arr.length - 1; j2++) {

							if (arr[j2] > arr[j2 + 1]) {
								Thread.sleep(1500);
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
					showUI();
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}.start();
	}
	// merge sorting forr 
	/*
	 * 
	 * 
	 * 
	 * 
	 * */
	static merging m = new merging();
	static int[] left = new int[10];
	static int[] right = new int[10];
	public static void mergeSort(final int[] arr, final JTextPane[] chartArr) {
		new Thread() {

			public void run() {
				try {
					hideUI();
					m.mergesort(arr,chartArr);
					m.merge(left, right, chartArr);
					System.out.println(Arrays.toString(arr));
					showUI();
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}.start();
	}
	 

	// following method does selection sort
	public static void selectionSort(final int[] arr, final JTextPane[] chartArr) {

		new Thread() {
			public void run() {
				try {
					hideUI();
					int i, j, minIndex, tmp;
					int n = arr.length;
					for (i = 0; i < n - 1; i++) {
						minIndex = i;
						// finding small number
						for (j = i + 1; j < n; j++) {
							if (arr[j] < arr[minIndex])
								minIndex = j;
						}

						if (minIndex != i) {

							int distance = Math.abs(chartArr[i].getX() - chartArr[minIndex].getX());
							int time = (distance * 30) + 1000; // finding time
																// difference
																// between swaps

							s = new Swap(chartArr[i], chartArr[minIndex]);

							tmp = arr[i];
							arr[i] = arr[minIndex];
							arr[minIndex] = tmp;

							JTextPane temp = chartArr[i];
							chartArr[i] = chartArr[minIndex];
							chartArr[minIndex] = temp;

							Thread.sleep(time);
						}
					}
					showUI();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}.start();

	}

	// following method is for insertion
	public static void insertionSort(final int[] arr, final JTextPane[] chartArr) {

		new Thread() {

			public void run() {
				try {
					hideUI();
					for (int i = 1; i < arr.length; i++) {
						int key = arr[i];
						JTextPane temp = chartArr[i];
						int j = i - 1;
						while (j >= 0 && arr[j] > key) {
							Thread.sleep(1800);
							s = new Swap(chartArr[j], temp);
							arr[j + 1] = arr[j];
							chartArr[j + 1] = chartArr[j];
							j--;
						}
						arr[j + 1] = key;
						chartArr[j + 1] = temp;
					}
					showUI();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}.start();
	}
	/*
	 * following sorting algorithms are for char sorting
	 */

	// following method is for insertion for char
	public static void insertionSort(final char[] arr, final JTextPane[] chartArr) {

		new Thread() {

			public void run() {
				try {
					hideUI();
					for (int i = 1; i < arr.length; i++) {
						char key = arr[i];
						JTextPane temp = chartArr[i];
						int j = i - 1;
						while (j >= 0 && arr[j] > key) {
							Thread.sleep(1800);
							s = new Swap(chartArr[j], temp);
							arr[j + 1] = arr[j];
							chartArr[j + 1] = chartArr[j];
							j--;
						}
						arr[j + 1] = key;
						chartArr[j + 1] = temp;
					}
					showUI();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}.start();
	}

	// following method does selection sort for char array
	public static void selectionSort(final char[] arr, final JTextPane[] chartArr) {

		new Thread() {
			public void run() {
				try {
					hideUI();
					int i, j, minIndex;
					char tmp;
					int n = arr.length;
					for (i = 0; i < n - 1; i++) {
						minIndex = i;
						// finding small number
						for (j = i + 1; j < n; j++) {
							if (arr[j] < arr[minIndex])
								minIndex = j;
						}

						if (minIndex != i) {

							int distance = Math.abs(chartArr[i].getX() - chartArr[minIndex].getX());
							int time = (distance * 30) + 1000; // finding time
																// difference
																// between swaps

							s = new Swap(chartArr[i], chartArr[minIndex]);

							tmp = arr[i];
							arr[i] = arr[minIndex];
							arr[minIndex] = tmp;

							JTextPane temp = chartArr[i];
							chartArr[i] = chartArr[minIndex];
							chartArr[minIndex] = temp;

							Thread.sleep(time);
						}
					}
					showUI();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}.start();

	}

	// following is bubble sort for characters
	public static void bubbleSort(final char[] arr, final JTextPane[] chartArr) {
		new Thread() {

			public void run() {
				try {
					hideUI();
					for (int j = 0; j < arr.length; j++) {
						for (int j2 = 0; j2 < arr.length - 1; j2++) {

							if (arr[j2] > arr[j2 + 1]) {
								Thread.sleep(1500);
								s = new Swap(chartArr[j2], chartArr[j2 + 1]);
								char tmp = arr[j2 + 1];
								arr[j2 + 1] = arr[j2];
								arr[j2] = tmp;

								JTextPane temp = chartArr[j2 + 1];
								chartArr[j2 + 1] = chartArr[j2];
								chartArr[j2] = temp;
							}

						}

					}
					showUI();
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}.start();
	}

	// check if it's numeric or not
	public boolean isNumeric(String s) {
		return s.matches("[-+]?\\d*\\.?\\d+");
	}

	// following is for hiding ui elements while algorithms working
	public static void hideUI() {
		comboBoxSort.setVisible(false);
		comboBoxRandomArray.setVisible(false);
		btnVisualize.setVisible(false);
	}

	// following is for hiding ui elements while algorithms working
	public static void showUI() {
		comboBoxSort.setVisible(true);
		comboBoxRandomArray.setVisible(true);
		btnVisualize.setVisible(true);
	}

	// following code is string generator
	public static String stringGenerate() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 2;
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (new Random().nextFloat() * (rightLimit - leftLimit));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();

		return generatedString;
	}
}