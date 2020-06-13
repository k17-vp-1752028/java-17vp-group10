import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.BoxLayout;
import java.awt.Checkbox;
import java.awt.Button;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form_App implements ActionListener{
	private Admin a = new Admin();
	private String user = new String();
	private String pass = new String();
	
	private String user2 = new String();
	private String pass2 = new String();
	
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_30;
	private JPanel panel_23;
	private JPanel panel_24;
	private JLabel lblNewLabel_31;
	
	private AutoCompleteTextField text7;

	private JFrame frame;
	private JMenuBar jBarMe;
	private JTextField textField_2;
	private JPasswordField passwordField;
	
	JPanel INFO_AC;
	
	private JPanel LOGIN;
	private JPanel REGISTER;
	
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_App window = new Form_App();
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
	public Form_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	public JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "COVID-19 STATISTICS CHART",
                "TYPE", "PERSON",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    private CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(this.a.GetNor(), "PERSON", "Normal");
        dataset.addValue(this.a.GetF0(), "PERSON", "F0");
        dataset.addValue(this.a.GetF1(), "PERSON", "F1");
        dataset.addValue(this.a.GeIsole(), "PERSON", "Isolee");
        dataset.addValue(this.a.GetGuegi(), "PERSON", "Guegi");
        return dataset;
    }
    
    
	
	
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.BLACK);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Downloads\\youtube\\1000px-Pok\u00E9_Ball.svg.png"));
		frame.setTitle("APP NCOVI - 19");
		frame.setSize(700, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setContentPane(new JLabel(new ImageIcon("D:\\Document de l'éducation\\HK7\\JAVA\\Project\\Photo\\3.jpg")));
		
		this.SetMenu();
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		ImageIcon lb_1 = new ImageIcon("D:\\Document de l'éducation\\HK7\\JAVA\\Project\\Photo\\3.jpg");
		Image img1 = lb_1.getImage();
		Image img_scal1 = img1.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
		lb_1 = new ImageIcon(img_scal1);
		
		JLabel New =  new JLabel(lb_1);
		LOGIN = new JPanel();
		LOGIN.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(LOGIN, "Card_Login");
		LOGIN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		LOGIN.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.PAGE_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		Component verticalStrut = Box.createVerticalStrut(120);
		verticalStrut.setBackground(SystemColor.inactiveCaption);
		panel_2.add(verticalStrut);
		
		JPanel panel_3 = new JPanel();
		panel_3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_3.setBackground(new Color(0, 51, 153));
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("---------------LOGIN---------------");
		lblNewLabel_2_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lblNewLabel_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblNewLabel_2_1.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_2_1.setBackground(new Color(0, 51, 255));
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("------------------------");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_3.add(lblNewLabel);
		
		Component glue = Box.createGlue();
		panel_3.add(glue);
		
		Component glue_1 = Box.createGlue();
		panel_3.add(glue_1);
		
		JLabel lblNewLabel_3 = new JLabel("CMND");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_3.setBackground(SystemColor.activeCaption);
		lblNewLabel_3.setAlignmentX(1.0f);
		panel_3.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.activeCaption);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setColumns(10);
		textField_2.setAlignmentX(1.0f);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("SDT");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(UIManager.getColor("Button.highlight"));
		panel_3.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.activeCaption);
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		passwordField.setToolTipText("");
		panel_3.add(passwordField);
		
		Component glue_2 = Box.createGlue();
		panel_3.add(glue_2);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		panel_3.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("SIGN IN");
		btnNewButton_2.setActionCommand("Sign");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setAlignmentX(1.0f);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("REGISTER");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_Register");
				
			}
		});
		panel_3.add(btnNewButton_1_1);
		
		//===========================================================================
		REGISTER = new JPanel();
		REGISTER.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(REGISTER, "Card_Register");
		REGISTER.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		REGISTER.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		Component verticalStrut_1 = Box.createVerticalStrut(80);
		verticalStrut_1.setBackground(SystemColor.inactiveCaption);
		panel.add(verticalStrut_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 51, 153));
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Infomation personnelle", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(new Color(51, 153, 255));
		panel_5.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.PAGE_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("ID (CMND)");
		panel_4.add(lblNewLabel_2);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_1);
		
		JLabel lblNewLabel_4 = new JLabel("Full name");
		panel_4.add(lblNewLabel_4);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_4.add(verticalGlue);
		
		JLabel lblNewLabel_5 = new JLabel("Age");
		lblNewLabel_5.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_4.add(lblNewLabel_5);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_2);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		panel_4.add(lblNewLabel_6);
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_3);
		
		JLabel lblNewLabel_7 = new JLabel("SDT");
		panel_4.add(lblNewLabel_7);
		
		Component verticalGlue_4 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_4);
		
		JLabel lblNewLabel_8 = new JLabel("National");
		panel_4.add(lblNewLabel_8);
		
		Component verticalGlue_5 = Box.createVerticalGlue();
		panel_4.add(verticalGlue_5);
		
		JLabel lblNewLabel_9 = new JLabel("Adresse");
		panel_4.add(lblNewLabel_9);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_6.setBackground(SystemColor.activeCaption);
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.PAGE_AXIS));
		
		textField = new JTextField();
		textField.setBackground(SystemColor.activeCaption);
		panel_6.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.activeCaption);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.activeCaption);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		Panel panel_8 = new Panel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_8.getLayout();
		flowLayout_2.setVgap(0);
		panel_6.add(panel_8);
		
		Checkbox checkbox_4 = new Checkbox("Male");
		panel_8.add(checkbox_4);
		
		Checkbox checkbox_5 = new Checkbox("Female");
		panel_8.add(checkbox_5);
		
		Checkbox checkbox_6 = new Checkbox("Other");
		panel_8.add(checkbox_6);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.activeCaption);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.activeCaption);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBackground(SystemColor.activeCaption);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel Type = new JPanel();
		Type.setBackground(new Color(0, 51, 153));
		Type.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Type de Sante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		FlowLayout flowLayout = (FlowLayout) Type.getLayout();
		panel.add(Type);
		
		Checkbox checkbox = new Checkbox("Normal");
		checkbox.setForeground(new Color(255, 255, 255));
		Type.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("F0");
		checkbox_1.setForeground(new Color(255, 255, 255));
		Type.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("F1");
		checkbox_2.setForeground(new Color(255, 255, 255));
		Type.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("Isolee");
		checkbox_3.setForeground(new Color(255, 255, 255));
		Type.add(checkbox_3);
		
		Checkbox checkbox_7 = new Checkbox("Guegi");
		checkbox_7.setForeground(new Color(255, 255, 255));
		Type.add(checkbox_7);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel.add(panel_7);
		
		Button button = new Button("Save");
		button.setBackground(new Color(51, 153, 51));
		panel_7.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_Login");
			}
		});
		button_1.setBackground(new Color(51, 153, 51));
		panel_7.add(button_1);
		
		JPanel HOME = new JPanel();
		frame.getContentPane().add(HOME, "Card_Home");
		HOME.setLayout(new BorderLayout(0, 0));
		
		JPanel Center = new JPanel();
		Center.setBorder(new LineBorder(new Color(0, 0, 0)));
		HOME.add(Center, BorderLayout.CENTER);
		Center.setLayout(new BoxLayout(Center, BoxLayout.PAGE_AXIS));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(SystemColor.activeCaption);
		Center.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user2 = text7.getText();
				
				if(a.CheckAc(user2) == false) {
					lblNewLabel_31.setText("CMND is not correct*(100)");
				}
				else {
					SetCARDInfo();
					((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_InfoAc");
				lblNewLabel_31.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblNewLabel_31.setForeground(Color.RED);
		}
				
			}
		});
		panel_9.add(btnNewButton_1);
		
		//textField_7 = new JTextField();
		 text7 = new AutoCompleteTextField();
		
		panel_9.add(text7);
		
		 lblNewLabel_31 = new JLabel("");
		panel_9.add(lblNewLabel_31);
		
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(SystemColor.activeCaption);
		Center.add(panel_16);
		
		ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 330));
       
        
        panel_16.add(chartPanel);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(SystemColor.activeCaption);
		Center.add(panel_17);
		
		JPanel panel_10 = new JPanel();
		HOME.add(panel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_10 = new JLabel("");
		
		ImageIcon lb_10 = new ImageIcon("D:\\Document de l'éducation\\HK7\\JAVA\\Project\\Photo\\dich-covid-19-chut-anh-sang-giua-con-bao-bieu-tinh-va-dich-benh-o-my.jpg");
		Image img = lb_10.getImage();
		Image img_scal = img.getScaledInstance(600, 50, Image.SCALE_SMOOTH);
		lb_10 = new ImageIcon(img_scal);
	
		lblNewLabel_10.setIcon(lb_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.X_AXIS));
		
		JLabel text_1 = new JLabel("NEWS");
		text_1.setForeground(Color.WHITE);
		text_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		
		JPanel title = new JPanel();
		title.setBorder(new LineBorder(new Color(0, 0, 0)));
		title.setBackground(Color.BLACK);
		title.add(text_1);
		title.setLayout(new FlowLayout());
		
		panel_10.add(title);
		panel_10.add(lblNewLabel_10);
		panel_10.setSize(600, 50);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(SystemColor.activeCaption);
		HOME.add(panel_11, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("QUITE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel_11.add(btnNewButton);
		
		JPanel panel_13 = new JPanel();
		panel_13.setAutoscrolls(true);
		panel_13.setBackground(Color.DARK_GRAY);
		HOME.add(panel_13, BorderLayout.EAST);
		panel_13.setLayout(new BoxLayout(panel_13, BoxLayout.LINE_AXIS));
		
		ImageIcon lb_12 = new ImageIcon("D:\\Document de l'éducation\\HK7\\JAVA\\Project\\Photo\\Picture2.png");
		img = lb_12.getImage();
		img_scal = img.getScaledInstance(100, 400, Image.SCALE_SMOOTH);
		lb_12 = new ImageIcon(img_scal);
		
		ImageIcon lb_13 = new ImageIcon("D:\\Document de l'éducation\\HK7\\JAVA\\Project\\Photo\\2.jpg");
		img = lb_13.getImage();
		img_scal = img.getScaledInstance(100, 400, Image.SCALE_SMOOTH);
		lb_13 = new ImageIcon(img_scal);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(30, 144, 255));
		panel_13.add(panel_14);
		panel_14.setLayout(new BoxLayout(panel_14, BoxLayout.PAGE_AXIS));
		
		JLabel lblNewLabel_11_1 = new JLabel("Remarque:");
		lblNewLabel_11_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11_1.setBackground(Color.DARK_GRAY);
		panel_14.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("");
		panel_14.add(lblNewLabel_12_1);
		
		lblNewLabel_12_1.setIcon(lb_12);
		
		JLabel lblLastUpdate_1 = new JLabel("Last Update:");
		lblLastUpdate_1.setForeground(Color.WHITE);
		lblLastUpdate_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_14.add(lblLastUpdate_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("");
		panel_14.add(lblNewLabel_13_1);
		
		lblNewLabel_13_1.setIcon(lb_13);
		
		JScrollBar scrollBar = new JScrollBar();
		panel_13.add(scrollBar);
		
		INFO_AC = new JPanel();
		INFO_AC.setBounds(new Rectangle(0, 0, 200, 0));
		INFO_AC.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(INFO_AC, "Card_InfoAc");
		
		JPanel panel_18 = new JPanel();
		panel_18.setMinimumSize(new Dimension(200, 10));
		panel_18.setBackground(SystemColor.activeCaption);
		INFO_AC.add(panel_18);
		panel_18.setLayout(new BoxLayout(panel_18, BoxLayout.PAGE_AXIS));
		
		Component verticalStrut_2 = Box.createVerticalStrut(70);
		verticalStrut_2.setMinimumSize(new Dimension(200, 70));
		verticalStrut_2.setBackground(SystemColor.activeCaption);
		panel_18.add(verticalStrut_2);
		
		JPanel panel_30 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_30.getLayout();
		panel_30.setBackground(Color.ORANGE);
		panel_18.add(panel_30);
		
		Label label_1 = new Label("INFOMATION");
		label_1.setPreferredSize(new Dimension(120, 30));
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_30.add(label_1);
		
		JPanel panel_20 = new JPanel();
		panel_20.setMinimumSize(new Dimension(200, 10));
		panel_20.setBounds(new Rectangle(0, 0, 100, 0));
		panel_20.setBackground(SystemColor.inactiveCaption);
		panel_20.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Information personnelle", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		panel_18.add(panel_20);
		panel_20.setLayout(new BoxLayout(panel_20, BoxLayout.X_AXIS));
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(30);
		panel_20.add(horizontalStrut_2);
		
		JPanel panel_21 = new JPanel();
		panel_21.setMinimumSize(new Dimension(100, 10));
		panel_21.setBackground(SystemColor.activeCaptionBorder);
		panel_20.add(panel_21);
		panel_21.setLayout(new BoxLayout(panel_21, BoxLayout.PAGE_AXIS));
		
		JLabel lblNewLabel_11 = new JLabel("ID");
		lblNewLabel_11.setBounds(new Rectangle(0, 0, 50, 10));
		panel_21.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Full name");
		panel_21.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Age");
		panel_21.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Gender");
		panel_21.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("National");
		panel_21.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Address");
		panel_21.add(lblNewLabel_16);
		
		JLabel lblNewLabel_24 = new JLabel("Type");
		panel_21.add(lblNewLabel_24);
		
		JLabel lblNewLabel_26 = new JLabel("SDT");
		lblNewLabel_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_Home");
			}
		});
		panel_21.add(lblNewLabel_26);
		
		JLabel lblNewLabel_28 = new JLabel("Day out");
		panel_21.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Day end");
		panel_21.add(lblNewLabel_29);
		
		Component horizontalStrut = Box.createHorizontalStrut(30);
		horizontalStrut.setBackground(SystemColor.textInactiveText);
		panel_20.add(horizontalStrut);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(SystemColor.info);
		panel_20.add(panel_22);
		panel_22.setLayout(new BoxLayout(panel_22, BoxLayout.PAGE_AXIS));
		
		 lblNewLabel_17 = new JLabel("Null");
		panel_22.add(lblNewLabel_17);
		
		 lblNewLabel_18 = new JLabel("Null");
		panel_22.add(lblNewLabel_18);
		
		 lblNewLabel_19 = new JLabel("Null");
		panel_22.add(lblNewLabel_19);
		
		 lblNewLabel_20 = new JLabel("Null");
		panel_22.add(lblNewLabel_20);
		
		 lblNewLabel_21 = new JLabel("Null");
		panel_22.add(lblNewLabel_21);
		
		 lblNewLabel_22 = new JLabel("Null");
		panel_22.add(lblNewLabel_22);
		
		 lblNewLabel_23 = new JLabel("Null");
		panel_22.add(lblNewLabel_23);
		
		 lblNewLabel_25 = new JLabel("Null");
		panel_22.add(lblNewLabel_25);
		
		 lblNewLabel_27 = new JLabel("NULL");
		panel_22.add(lblNewLabel_27);
		
		 lblNewLabel_30 = new JLabel("NULL");
		panel_22.add(lblNewLabel_30);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(30);
		panel_20.add(horizontalStrut_1);
		
		 panel_23 = new JPanel();
		panel_23.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Person reason", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		panel_23.setBackground(SystemColor.inactiveCaption);
		panel_18.add(panel_23);
		
		 panel_24 = new JPanel();
		panel_24.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Person connect", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		panel_24.setBackground(SystemColor.inactiveCaption);
		panel_18.add(panel_24);
		
		
		JPanel ADMIN = new JPanel();
		ADMIN.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(ADMIN, "Card_Admin");
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(SystemColor.activeCaption);
		ADMIN.add(panel_12);
		panel_12.setLayout(new BoxLayout(panel_12, BoxLayout.PAGE_AXIS));
		
		Component verticalStrut_3 = Box.createVerticalStrut(100);
		panel_12.add(verticalStrut_3);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.ORANGE);
		FlowLayout flowLayout_3 = (FlowLayout) panel_29.getLayout();
		panel_12.add(panel_29);
		
		Label label = new Label("ADMIN");
		label.setForeground(Color.RED);
		label.setFont(new Font("Courier New", Font.BOLD, 15));
		panel_29.add(label);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.add(panel_15);
		
		JButton btnNewButton_3 = new JButton("Search");
		panel_15.add(btnNewButton_3);
		
		textField_8 = new AutoCompleteTextField();
		panel_15.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(new LineBorder(new Color(255, 175, 175)), "Info", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_12.add(panel_19);
		panel_19.setLayout(new BoxLayout(panel_19, BoxLayout.X_AXIS));
		
		JPanel panel_27 = new JPanel();
		panel_19.add(panel_27);
		panel_27.setLayout(new BoxLayout(panel_27, BoxLayout.PAGE_AXIS));
		
		Label label_2 = new Label("ID");
		panel_27.add(label_2);
		
		Label label_4 = new Label("Name");
		panel_27.add(label_4);
		
		Label label_8 = new Label("National");
		panel_27.add(label_8);
		
		JPanel panel_28 = new JPanel();
		panel_19.add(panel_28);
		panel_28.setLayout(new BoxLayout(panel_28, BoxLayout.PAGE_AXIS));
		
		Label label_5 = new Label("NULL");
		panel_28.add(label_5);
		
		Label label_6 = new Label("NULL");
		panel_28.add(label_6);
		
		Label label_7 = new Label("NULL");
		panel_28.add(label_7);
		
		
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "TYPE", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_12.add(panel_25);
		
		Checkbox checkbox_8 = new Checkbox("F0");
		panel_25.add(checkbox_8);
		
		Checkbox checkbox_9 = new Checkbox("F1");
		panel_25.add(checkbox_9);
		
		Checkbox checkbox_10 = new Checkbox("Isolee");
		panel_25.add(checkbox_10);
		
		Checkbox checkbox_11 = new Checkbox("Guegi");
		panel_25.add(checkbox_11);
		
		JPanel panel_26 = new JPanel();
		panel_12.add(panel_26);
		
		JButton btnNewButton_4 = new JButton("Save");
		panel_26.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Cancel");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_Home");
			}
		});
		panel_26.add(btnNewButton_5);
		
		
	}
	//================================SET_CARDINFO===============================================
	void SetCARDInfo() {
		int i, temp = 0;
		
		if(this.a.CheckAc(user2) == true) {
			for(i = 0; i < this.a.GetList().length; i++) {
				if(this.a.Compare(user2, this.a.GetList()[i].GetID()) == true) {
					temp = i;
					break;
				}
			}
		
			if(temp >= this.a.GetList().length)
				return;
			
			lblNewLabel_17.setText(this.a.GetList()[temp].GetID());
			lblNewLabel_18.setText(this.a.GetList()[temp].GetName());
			lblNewLabel_19.setText(Integer.toString(this.a.GetList()[temp].GetAge()));
			lblNewLabel_20.setText(this.a.GetList()[temp].GetGen());
			lblNewLabel_21.setText(this.a.GetList()[temp].GetNa());
			lblNewLabel_22.setText(this.a.GetList()[temp].GetAd());
			lblNewLabel_23.setText(this.a.GetList()[temp].GetType());
			lblNewLabel_25.setText(this.a.GetList()[temp].GetSDT());
			
			if(this.a.GetList()[temp].GetDaySt() == "")
				lblNewLabel_27.setText("//");
			else
				lblNewLabel_27.setText(this.a.GetList()[temp].GetDaySt());
			
			if(this.a.GetList()[temp].GetDayEnd() == "")
				lblNewLabel_30.setText("//");
			else
				lblNewLabel_30.setText(this.a.GetList()[temp].GetDayEnd());
			
			
			
			for(int j = 0; j < this.a.GetList()[temp].GetReason().size(); j++) {
				JLabel t = new JLabel();
				t.setText(this.a.GetList()[temp].GetReason().get(j));
				t.setForeground(Color.RED);
				t.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
				t.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						user2 = t.getText();
						SetCARDInfo();
						((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_InfoAc");
					}
				});
				
				panel_23.add(t);
			}
			
			for(int j = 0; j < this.a.GetList()[temp].GetConnect().size(); j++) {
				JLabel t = new JLabel();
				t.setText(this.a.GetList()[temp].GetConnect().get(j));
				t.setForeground(Color.RED);
				t.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
				t.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						user2 = t.getText();
						SetCARDInfo();
						((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_InfoAc");
					}
				});
				
				panel_24.add(t);
			}
		}
	}
	
	//================================SET-MENU===================================================
	void SetMenu(){
        // Create the menu bar.
        jBarMe = new JMenuBar();

        // Create the File menu.
        JMenu Account = new JMenu("Account");
        Account.setMnemonic(KeyEvent.VK_F);

        JMenuItem Infomation = new JMenuItem("Infomation", KeyEvent.VK_O);
        Infomation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
                InputEvent.CTRL_DOWN_MASK));
 
        JMenuItem jExit = new JMenuItem("Exit", KeyEvent.VK_E);
        jExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
                InputEvent.CTRL_DOWN_MASK));

        Account.add(Infomation);
        Account.addSeparator();
        Account.add(jExit);
        jBarMe.add(Account);
        
        //===================================================================================================
        
        JMenu JOption = new JMenu("Option");
        JOption.setMnemonic(KeyEvent.VK_0);
        
        JMenuItem Search = new JMenuItem("Search", KeyEvent.VK_A);
        Search.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
                InputEvent.CTRL_DOWN_MASK));
        
        JMenuItem UpdateAccount = new JMenuItem("Update personal info", KeyEvent.VK_U);
        UpdateAccount.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,
                InputEvent.CTRL_DOWN_MASK));
        
        Search.setActionCommand("Search");
        UpdateAccount.setActionCommand("Update");
        
        JOption.add(Search);
        JOption.add(UpdateAccount);
        jBarMe.add(JOption);

        // Add action listeners for the menu items.
        Infomation.addActionListener(this);
        jExit.addActionListener(this);
        
        Search.addActionListener(this);
        UpdateAccount.addActionListener(this);


        //-===================================================================================
        //====================================================================================
    }

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comStr = e.getActionCommand();
		
		if (comStr.equals("Exit")) System.exit(0);
		
		if (comStr.equals("Search")) {
			((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_Home");
		}
		
		if (comStr.equals("Sign")) {
			user = textField_2.getText();
			pass = passwordField.getText();
			user2 = user;
			pass2 = pass;
			
			if(user.equals("admin") && pass.equals("admin")) {
				((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_Admin");
			}
			else {
				if(a.CheckAc(user) == true) {
					if(a.CheckAcPas(user, pass) == true) {
						lblNewLabel_1.setText("CORRECT");
						JOptionPane.showMessageDialog(null, "CORRECT");
						
						frame.setJMenuBar(this.jBarMe);
						
						this.SetCARDInfo();
						
						((CardLayout) frame.getContentPane().getLayout()).show(frame.getContentPane(), "Card_InfoAc");
				
						//this.jBarMe.show();
					}
					else {
						lblNewLabel_1.setText("PASS IS NOT CORRECT*(100)");
						JOptionPane.showMessageDialog(null, "PASS IS NOT CORRECT*(100)");
					}		
				}
				else {
					lblNewLabel_1.setText("CMND IS NOT CORRECT*(101)");
					JOptionPane.showMessageDialog(null, "CMND IS NOT CORRECT*(101)");
				}
			}
		}

	}

}
