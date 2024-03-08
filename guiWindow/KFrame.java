/**
 * @Author: Brayden Graham
 * @Author: Zach Haight
 * @Company: Krypto Industries
 * @Version: 1.0
 */

package guiWindow;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

@SuppressWarnings("unused")
public class KFrame extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;

    private static JButton JButton = null;
    private static JCheckBox JCheckBox = null;
    private static JCheckBoxMenuItem JCheckBoxMenuItem = null;
    private static JColorChooser JColorChooser = null;
    private static JComponent JComponent = null;
    private static JDesktopPane JDesktopPane = null;
    private static JDialog JDialog = null;
    private static JEditorPane JEditorPane = null;
    private static JFileChooser JFileChooser = null;
    private static JFormattedTextField JFormattedTextField = null;
    private static JInternalFrame JInternalFrame = null;
    private static JLabel JLabel = null;
    private static JLayeredPane JLayeredPane = null;
    private static JMenu JMenu = null;
    private static JMenuBar JMenuBar = null;
    private static JMenuItem JMenuItem = null;
    private static JOptionPane JOptionPane = null;
    private static JPanel JPanel = null;
    private static JPasswordField JPasswordField = null;
    private static JPopupMenu JPopupMenu = null;
    private static JProgressBar JProgressBar = null;
    private static JRadioButton JRadioButton = null;
    private static JRadioButtonMenuItem JRadioButtonMenuItem = null;
    private static JRootPane JRootPane  = null;
    private static JScrollBar JScrollBar  = null;
    private static JScrollPane JScrollPane  = null;
    private static JSeparator JSeparator  = null;
    private static JSlider JSlider  = null;
    private static JSpinner JSpinner  = null;
    private static JSplitPane JSplitPane  = null;
    private static JTabbedPane JTabbedPane  = null;
    private static JTable JTable  = null;
    private static JTextArea JTextArea  = null;
    private static JTextField JTextField  = null;
    private static JTextPane JTextPane  = null;
    private static JToggleButton JToggleButton  = null;
    private static JToolBar JToolBar  = null;
    private static JToolTip JToolTip  = null;
    private static JTree JTree  = null;
    private static JViewport JViewport  = null;
    private static JWindow JWindow  = null;

    private static boolean frameMovable = false;

    private static boolean frameResizable = false;
    private static boolean frameVisible = true;
    private static boolean frameCenter = false;
    private static boolean frameResizeable = false;

    private static int frameSizeWidth = 400;
    private static int frameSizeHeight = 300;
    private static int frameLocationX = 50;
    private static int frameLocationY = 50;

    private static String minimizeIcon = "⎼";
    private static String maximizeIcon = "▢";
    private static String exitIcon = "X";

    private static Color minimizeColor = Color.WHITE;
    private static Color maximizeColor = Color.WHITE;
    private static Color exitColor = Color.RED;
    private static Color frameBackgroundColor = Color.DARK_GRAY;

    private final javax.swing.JFrame frame = new JFrame();

    public KFrame() {
        JButton buttonMinimize = createButtonMinimize();
        JButton buttonMaximize = createButtonMaximize();
        JButton buttonExit = createButtonExit();

        //if (frameMovable = true) {
        //TODO add Movable
        //}
        //if (frameCenter = true) {
        //TODO add Center
        //}

        //Exit Confirm
        buttonExit.addActionListener(e -> {
            int confirm = javax.swing.JOptionPane.showOptionDialog(frame,
                    "Are You Sure to Close Application?", "Exit Confirmation",
                    javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE,
                    null, null, null);
            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        //Window Maximize/Normalize
        buttonMaximize.addActionListener(e -> {
            if (frame.getExtendedState() == JFrame.NORMAL) {
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            } else {
                frame.setExtendedState(JFrame.NORMAL);
            }

        });

        //Minimize
        buttonMinimize.addActionListener(e -> frame.setState(Frame.ICONIFIED));

        javax.swing.JLabel buttonPanel = new JLabel();
        buttonPanel.setLayout(new GridLayout(0, 3, 5, 0));
        buttonPanel.setPreferredSize(new Dimension(160, 25));
        buttonPanel.add(buttonMinimize);
        buttonPanel.add(buttonMaximize);
        buttonPanel.add(buttonExit);

        GradientPanel titlePanel = new GradientPanel(Color.DARK_GRAY);
        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(new JLabel(BorderLayout.WEST));
        titlePanel.add(new JLabel(), BorderLayout.CENTER);
        titlePanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        titlePanel.add(buttonPanel, BorderLayout.EAST);

        javax.swing.JPanel contentPanel = new JPanel();

        contentPanel.setBackground(frameBackgroundColor);

        try{
        contentPanel.add(JButton);
        contentPanel.add(JCheckBox);
        contentPanel.add(JCheckBoxMenuItem);
        contentPanel.add(JColorChooser);
        contentPanel.add(JComponent);
        contentPanel.add(JDesktopPane);
        contentPanel.add(JDialog);
        contentPanel.add(JEditorPane);
        contentPanel.add(JFileChooser);
        contentPanel.add(JFormattedTextField);
        contentPanel.add(JInternalFrame);
        contentPanel.add(JLabel);
        contentPanel.add(JLayeredPane);
        contentPanel.add(JMenu);
        contentPanel.add(JMenuBar);
        contentPanel.add(JMenuItem);
        contentPanel.add(JOptionPane);
        contentPanel.add(JPanel);
        contentPanel.add(JPasswordField);
        contentPanel.add(JPopupMenu);
        contentPanel.add(JProgressBar);
        contentPanel.add(JRadioButton);
        contentPanel.add(JRadioButtonMenuItem);
        contentPanel.add(JScrollBar);
        contentPanel.add(JScrollPane);
        contentPanel.add(JSeparator);
        contentPanel.add(JSlider);
        contentPanel.add(JSpinner);
        contentPanel.add(JSplitPane);
        contentPanel.add(JTabbedPane);
        contentPanel.add(JTable);
        contentPanel.add(JTextArea);
        contentPanel.add(JTextField);
        contentPanel.add(JTextPane);
        contentPanel.add(JToggleButton);
        contentPanel.add(JToolBar);
        contentPanel.add(JToolTip);
        contentPanel.add(JTree);
        contentPanel.add(JViewport);
        contentPanel.add(JWindow);
        } catch (Exception ignored) {

        }

        javax.swing.JPanel fatherPanel = new JPanel();
        fatherPanel.setLayout(new BorderLayout());
        fatherPanel.add(titlePanel, BorderLayout.NORTH);
        fatherPanel.add(contentPanel, BorderLayout.CENTER);

        setResizable(frameResizable);
        frame.setPreferredSize(new Dimension(frameSizeWidth, frameSizeHeight));
        frame.setUndecorated(true);
        frame.add(fatherPanel);

        frame.pack();
        if(frameCenter){
            frame.setLocationRelativeTo(null);

        } else {
            frame.setLocation(frameLocationX, frameLocationY);
        }
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(frameVisible);
    }

    public static Color getMinimizeColor() {
        return minimizeColor;
    }
    public static void setMinimizeColor(Color minimizeColor) {
        KFrame.minimizeColor = minimizeColor;
    }

    public static Color getMaximizeColor() {
        return maximizeColor;
    }
    public static void setMaximizeColor(Color maximizeColor) {
        KFrame.maximizeColor = maximizeColor;
    }

    public static Color getExitColor() {
        return exitColor;
    }
    public static void setExitColor(Color exitColor) {
        KFrame.exitColor = exitColor;
    }

    public static int getFrameSizeWidth() {
        return frameSizeWidth;
    }
    public static void setFrameSizeWidth(int frameSizeWidth) {
        KFrame.frameSizeWidth = frameSizeWidth;
    }

    public static int getFrameSizeHeight() {
        return frameSizeHeight;
    }
    public static void setFrameSizeHeight(int frameSizeHeight) {
        KFrame.frameSizeHeight = frameSizeHeight;
    }

    public static boolean isFrameCenter() {
        return frameCenter;
    }
    public static void setFrameCenter(boolean frameCenter) {
        KFrame.frameCenter = frameCenter;
    }

    public static int getFrameLocationX() {
        return frameLocationX;
    }
    public static void setFrameLocationX(int frameLocationX) {
        KFrame.frameLocationX = frameLocationX;
    }

    public static int getFrameLocationY() {
        return frameLocationY;
    }
    public static void setFrameLocationY(int frameLocationY) {
        KFrame.frameLocationY = frameLocationY;
    }

    public static boolean isFrameResizeable() {
        return frameResizeable;
    }
    public static void setFrameResizeable(boolean frameResizeable) {
        KFrame.frameResizeable = frameResizeable;
    }

    public static boolean isFrameMovable() {
        return frameMovable;
    }
    public static void setFrameMovable(boolean frameMovable) {
        KFrame.frameMovable = frameMovable;
    }

    public static boolean isFrameVisible() {
        return frameVisible;
    }
    public static void setFrameVisible(boolean frameVisible) {
        KFrame.frameVisible = frameVisible;
    }

    public static Color getFrameBackgroundColor() {
        return frameBackgroundColor;
    }

    public static void setFrameBackgroundColor(Color frameBackgroundColor) {
        KFrame.frameBackgroundColor = frameBackgroundColor;
    }

    @SuppressWarnings("DuplicatedCode")
    private javax.swing.JButton createButtonMinimize() {
        javax.swing.JButton button = new JButton(minimizeIcon);
        button.setForeground(minimizeColor);
        button.setBorderPainted(false);
        button.setBorder(null);
        button.setFocusable(false);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setContentAreaFilled(false);
        return button;
    }

    @SuppressWarnings("DuplicatedCode")
    private javax.swing.JButton createButtonMaximize() {
        javax.swing.JButton button = new JButton(maximizeIcon);
        button.setForeground(maximizeColor);
        button.setBorderPainted(false);
        button.setBorder(null);
        button.setFocusable(false);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setContentAreaFilled(false);
        return button;
    }

    @SuppressWarnings("DuplicatedCode")
    private javax.swing.JButton createButtonExit() {
        javax.swing.JButton button = new JButton(exitIcon);
        button.setForeground(exitColor);
        button.setBorderPainted(false);
        button.setBorder(null);
        button.setFocusable(false);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setContentAreaFilled(false);
        return button;
    }

    public String getMinimizeIcon() {
        return minimizeIcon;
    }
    public static void setMinimizeIcon(String minimizeIcon) {
        KFrame.minimizeIcon = minimizeIcon;
    }

    public String getMaximizeIcon() {
        return maximizeIcon;
    }
    public static void setMaximizeIcon(String maximizeIcon) {
        KFrame.maximizeIcon = maximizeIcon;
    }

    public String getExitIcon() {
        return exitIcon;
    }
    public static void setExitIcon(String exitIcon) {
        KFrame.exitIcon = exitIcon;
    }

    public static void JButton(javax.swing.JButton JButton) {
        KFrame.JButton = JButton;
    }

    public static void JCheckBox(javax.swing.JCheckBox JCheckBox) {
        KFrame.JCheckBox = JCheckBox;
    }

    public static void JCheckBoxMenuItem(javax.swing.JCheckBoxMenuItem JCheckBoxMenuItem) {
        KFrame.JCheckBoxMenuItem = JCheckBoxMenuItem;
    }

    public static void JColorChooser(javax.swing.JColorChooser JColorChooser) {
        KFrame.JColorChooser = JColorChooser;
    }

    public static void JComponent(javax.swing.JComponent JComponent) {
        KFrame.JComponent = JComponent;
    }

    public static void JDesktopPane(javax.swing.JDesktopPane JDesktopPane) {
        KFrame.JDesktopPane = JDesktopPane;
    }

    public static void JDialog(javax.swing.JDialog JDialog) {
        KFrame.JDialog = JDialog;
    }

    public static void JEditorPane(javax.swing.JEditorPane JEditorPane) {
        KFrame.JEditorPane = JEditorPane;
    }

    public static void JFileChooser(javax.swing.JFileChooser JFileChooser) {
        KFrame.JFileChooser = JFileChooser;
    }

    public static void JFormattedTextField(javax.swing.JFormattedTextField JFormattedTextField) {
        KFrame.JFormattedTextField = JFormattedTextField;
    }

    public static void JInternalFrame(javax.swing.JInternalFrame JInternalFrame) {
        KFrame.JInternalFrame = JInternalFrame;
    }

    public static void JLabel(javax.swing.JLabel JLabel) {
        KFrame.JLabel = JLabel;
    }

    public static void JLayeredPane(javax.swing.JLayeredPane JLayeredPane) {
        KFrame.JLayeredPane = JLayeredPane;
    }

    public static void JMenu(javax.swing.JMenu JMenu) {
        KFrame.JMenu = JMenu;
    }

    public static void JMenuBar(javax.swing.JMenuBar JMenuBar) {
        KFrame.JMenuBar = JMenuBar;
    }

    public static void JMenuItem(javax.swing.JMenuItem JMenuItem) {
        KFrame.JMenuItem = JMenuItem;
    }

    public static void JOptionPane(javax.swing.JOptionPane JOptionPane) {
        KFrame.JOptionPane = JOptionPane;
    }

    public static void JPanel(javax.swing.JPanel JPanel) {
        KFrame.JPanel = JPanel;
    }

    public static void JPasswordField(javax.swing.JPasswordField JPasswordField) {
        KFrame.JPasswordField = JPasswordField;
    }

    public static void JPopupMenu(javax.swing.JPopupMenu JPopupMenu) {
        KFrame.JPopupMenu = JPopupMenu;
    }

    public static void JProgressBar(javax.swing.JProgressBar JProgressBar) {
        KFrame.JProgressBar = JProgressBar;
    }

    public static void JRadioButton(javax.swing.JRadioButton JRadioButton) {
        KFrame.JRadioButton = JRadioButton;
    }

    public static void JRadioButtonMenuItem(javax.swing.JRadioButtonMenuItem JRadioButtonMenuItem) {
        KFrame.JRadioButtonMenuItem = JRadioButtonMenuItem;
    }

    public static void JRootPane(javax.swing.JRootPane JRootPane) {
        KFrame.JRootPane = JRootPane;
    }

    public static void JScrollBar(javax.swing.JScrollBar JScrollBar) {
        KFrame.JScrollBar = JScrollBar;
    }

    public static void JScrollPane(javax.swing.JScrollPane JScrollPane) {
        KFrame.JScrollPane = JScrollPane;
    }

    public static void JSeparator(javax.swing.JSeparator JSeparator) {
        KFrame.JSeparator = JSeparator;
    }

    public static void JSlider(javax.swing.JSlider JSlider) {
        KFrame.JSlider = JSlider;
    }

    public static void JSpinner(javax.swing.JSpinner JSpinner) {
        KFrame.JSpinner = JSpinner;
    }

    public static void JSplitPane(javax.swing.JSplitPane JSplitPane) {
        KFrame.JSplitPane = JSplitPane;
    }

    public static void JTabbedPane(javax.swing.JTabbedPane JTabbedPane) {
        KFrame.JTabbedPane = JTabbedPane;
    }

    public static void JTable(javax.swing.JTable JTable) {
        KFrame.JTable = JTable;
    }

    public static void JTextArea(javax.swing.JTextArea JTextArea) {
        KFrame.JTextArea = JTextArea;
    }

    public static void JTextField(javax.swing.JTextField JTextField) {
        KFrame.JTextField = JTextField;
    }

    public static void JTextPane(javax.swing.JTextPane JTextPane) {
        KFrame.JTextPane = JTextPane;
    }

    public static void JToggleButton(javax.swing.JToggleButton JToggleButton) {
        KFrame.JToggleButton = JToggleButton;
    }

    public static void JToolBar(javax.swing.JToolBar JToolBar) {
        KFrame.JToolBar = JToolBar;
    }

    public static void JToolTip(javax.swing.JToolTip JToolTip) {
        KFrame.JToolTip = JToolTip;
    }

    public static void JTree(javax.swing.JTree JTree) {
        KFrame.JTree = JTree;
    }

    public static void JViewport(javax.swing.JViewport JViewport) {
        KFrame.JViewport = JViewport;
    }

    public static void JWindow(javax.swing.JWindow JWindow) {
        KFrame.JWindow = JWindow;
    }

    private static class GradientPanel extends JPanel {

        @Serial
        private static final long serialVersionUID = 1L;

        public GradientPanel(Color background) {
            setBackground(background);
        }

        //Gradient Support
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (isOpaque()) {
                Color background = new Color(49, 46, 46);
                Color controlColor = new Color(49, 46, 46);
                int width = getWidth();
                int height = getHeight();
                Graphics2D g2 = (Graphics2D) g;
                Paint oldPaint = g2.getPaint();
                g2.setPaint(new GradientPaint(0, 0, background, width, 0, controlColor));
                g2.fillRect(0, 0, width, height);
                g2.setPaint(oldPaint);
            }
        }
    }
}