import javax.swing.*;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.border.*;
import javax.swing.table.*;
import Classes.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class ManagementPage extends JFrame implements ActionListener, MouseListener {
    JButton addMedButton, removeMedButton, searchButton, back, exit;
    JPanel medPanel, optionPanel;
    JLabel addRemovemed, medId, company, medExpaire, searchMed, medName;
    // JLabel medName;
    JTextField medid, medname, medcompany, medexpaire, searchmed;
    Font font, font1;
    Border border;
    ImageIcon addMed, removeMed;

    JTable medTable;
    JScrollPane medJSP;
    Medicine meds;
    Medicine medList[] = new Medicine[50];
    String medTableHeader[] = { "Medecine ID", "Medecine Name", "company", "Expaire" };// bookTableHeader
    String medRow[] = new String[4];
    DefaultTableModel model2;

    public ManagementPage() {

        this.setTitle("Hospital  Management System");
        this.setSize(800, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Table/////////////////////
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(medTableHeader);
        medTable = new JTable();
        medTable.setModel(model2);

        medTable.setFont(font);
        // medTable.setSelectionBackground(Color.decode("#ffef85"));
        medTable.setBackground(Color.decode("#fbffd1"));
        medTable.setRowHeight(20);
        medJSP = new JScrollPane(medTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        medJSP.setBounds(260, 280, 500, 270);
        medTable.addMouseListener(this);
        this.add(medJSP);

        ///////// Panel////////////
        optionPanel = new JPanel();
        // border = new LineBorder(Color.decode("#00b5a6"), 1, true);
        optionPanel.setLayout(null);
        optionPanel.setBounds(0, 0, 250, 600);
        optionPanel.setBackground(Color.decode("#5cdfff"));
        optionPanel.setBorder(border);
        this.add(optionPanel);

        medPanel = new JPanel();
        // border = new LineBorder(Color.decode("#00b5a6"), 1, true);
        medPanel.setLayout(null);
        medPanel.setBounds(260, 05, 500, 270);
        medPanel.setBackground(Color.decode("#51d4f5"));
        medPanel.setBorder(border);
        this.add(medPanel);

        /* ==================== JLables ==================== */
        addRemovemed = new JLabel("Add or Remove Medicine");
        addRemovemed.setBounds(10, 105, 190, 13);
        addRemovemed.setFont(font);
        optionPanel.add(addRemovemed);

        medId = new JLabel("Medecine ID:");
        medId.setBounds(30, 60, 150, 18);
        medId.setFont(font1);
        medPanel.add(medId);

        medName = new JLabel("Mecine Name:");
        medName.setBounds(30, 110, 150, 18);
        medName.setFont(font1);
        medPanel.add(medName);

        company = new JLabel("Compay:");
        company.setBounds(30, 160, 150, 18);
        company.setFont(font1);
        medPanel.add(company);

        medExpaire = new JLabel("Expiyer Date:");
        medExpaire.setBounds(30, 210, 150, 18);
        medExpaire.setFont(font1);
        medPanel.add(medExpaire);

        /* ==================== JTextField ==================== */

        searchmed = new JTextField();
        searchmed.setBounds(10, 325, 170, 30);
        searchmed.setFont(font1);
        optionPanel.add(searchmed);

        medid = new JTextField();
        medid.setBounds(170, 58, 250, 25);
        medid.setFont(font1);
        medPanel.add(medid);

        medname = new JTextField();
        medname.setBounds(170, 108, 250, 25);
        medname.setFont(font1);
        medPanel.add(medname);

        medcompany = new JTextField();
        medcompany.setBounds(170, 158, 250, 25);
        medcompany.setFont(font1);
        medPanel.add(medcompany);

        medexpaire = new JTextField();
        medexpaire.setBounds(170, 208, 250, 25);
        medexpaire.setFont(font1);
        medPanel.add(medexpaire);

        /* ==================== Buttons ==================== */
        addMed = new ImageIcon(getClass().getResource("add medicine.gif"));
        addMedButton = new JButton(addMed);
        addMedButton.setBounds(20, 125, 100, 100);
        addMedButton.setFont(font);
        addMedButton.setFocusable(false);
        addMedButton.addActionListener(this);
        optionPanel.add(addMedButton);

        removeMed = new ImageIcon(getClass().getResource("remove medicine.gif"));
        removeMedButton = new JButton(removeMed);
        removeMedButton.setBounds(130, 125, 100, 100);
        removeMedButton.setFont(font);
        removeMedButton.setFocusable(false);
        removeMedButton.addActionListener(this);
        optionPanel.add(removeMedButton);

        searchButton = new JButton("Search");
        searchButton.setBounds(45, 360, 100, 30);
        searchButton.setBackground(Color.decode("#8826c9"));
        searchButton.setForeground(Color.white);
        searchButton.setFont(new Font("System", Font.BOLD, 18));
        searchButton.setFocusable(false);
        searchButton.addActionListener(this);
        optionPanel.add(searchButton);

        // Back Button **********/

        back = new JButton("BACK");
        back.setBounds(10, 500, 100, 30);
        back.setBackground(Color.decode("#8826c9"));
        back.setForeground(Color.white);
        back.setFont(new Font("System", Font.BOLD, 18));
        back.setFocusable(false);
        back.addActionListener(this);
        optionPanel.add(back);

        exit = new JButton("EXIT");
        exit.setBounds(130, 500, 100, 30);
        exit.setBackground(Color.decode("#8826c9"));
        exit.setForeground(Color.white);
        exit.setFont(new Font("System", Font.BOLD, 18));
        exit.setFocusable(false);
        exit.addActionListener(this);
        optionPanel.add(exit);

    }
    


    public void addMed(String med_id, String medName2, String med_company, String med_edition) {
        int flag = 0;
        meds = new Medicine(med_id, medName2, med_company, med_edition);
        for (int i = 0; i < medList.length; i++) {
            if (medList[i] == null) {
                medList[i] = meds;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            showMessageDialog(null, "Medicine has been added");
        } else {
            showMessageDialog(null, "Something wrong:(");
        }
    }

    public void removeMed(String med_id) {
        try {
            int flag = 0;
            for (int i = 0; i < medList.length; i++) {
                if (medList[i] != null) {
                    if (medList[i].getmedID().equals(med_id)) {
                        medList[i] = null;
                        flag = 1;
                        break;
                    }
                } else {
                    continue;
                }
            }
            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "Medecine has been removed");
            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            showMessageDialog(null, "Null_Pointer_Error");
        }
    }
    /* ================= Hospital Management Method ================= */

    public void searchMed(String med_name) {
        int flag = 0;
        for (int i = 0; i < medList.length; i++) {
            if (medList[i] != null) {
                if (medList[i].getmedName().equalsIgnoreCase(med_name)) {
                    // showMessageDialog(null, "Book Available");
                    flag = 1;
                    break;
                }
            } else {
                continue;
            }
        }
        if (flag == 1) {
            showMessageDialog(null, "Medecine Available");
        } else {
            showMessageDialog(null, "Soory:(\nMedicine is not available");
        }
    }

    public void actionPerformed(ActionEvent e) {
        String medId = medid.getText();
        String medName = medname.getText();
        String company = medcompany.getText();
        String medExpaire = medexpaire.getText();

        if (e.getSource() == addMedButton) {
            addMed(medId, medName, company, medExpaire);
            medRow[0] = medId;
            medRow[1] = medName;
            medRow[2] = company;
            medRow[3] = medExpaire;
            medid.setText(null);
            medname.setText(null);
            medcompany.setText(null);
            medexpaire.setText(null);
            model2.addRow(medRow);
        }

        if (e.getSource() == removeMedButton) {
            removeMed(medId);
            int numberOfSelectedRow = medTable.getSelectedRow();
            if (numberOfSelectedRow >= 0) {
                model2.removeRow(numberOfSelectedRow);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Failed!! No row has been selected\nOr no row exists\nOr Invalid Info");
            }
        }
        if (e.getSource() == searchButton) {
            String searchfield = searchmed.getText();
            searchMed(searchfield);
            searchmed.setText(null);
        } else if (e.getSource() == back) {
            Admin2 c1 = new Admin2();
            c1.setVisible(true);
            this.setVisible(false);
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }

    }

    // Action listener ///

    public void mouseClicked(MouseEvent e) {
    }

    /*
     * int numberOfRow = issueReturnTable.getSelectedRow();
     * 
     * //String std_ID = model3.getValueAt(numberOfRow, 0).toString();
     * String book_ID = model3.getValueAt(numberOfRow, 1).toString();
     * //String issue_DATE = model3.getValueAt(numberOfRow, 2).toString();
     * //String return_DATE = model3.getValueAt(numberOfRow, 3).toString();
     * //String return_STATUS = model3.getValueAt(numberOfRow, 4).toString()
     */
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
