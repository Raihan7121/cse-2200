 package bondhon.management.system;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class Searchviewp0rofile extends javax.swing.JFrame {

    
    int id;
    public Searchviewp0rofile(int id1) {
        id=id1;
        initComponents();
        try{
        String url = "jdbc:mysql://localhost:3306/bondhon";
        String dUser = "root";
        String dPass = "";

        try {
            Connection connection = DriverManager.getConnection(url, dUser, dPass);

            // Replace these with user-provided values
            

            // Create a prepared statement to check if the user's email and password match
            String sql = "SELECT * FROM bondhonuser WHERE id=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
      
            while(resultSet.next()) {
                
              
                String username = resultSet.getString("name");
                String fname = resultSet.getString("fathername");
                String mname = resultSet.getString("mothername");
                String bday= resultSet.getString("birthday");
                String mobile= resultSet.getString("mobile");
                String email= resultSet.getString("email");
                String age = resultSet.getString("age");
                String gender = resultSet.getString("gender");
                String religion = resultSet.getString("religion");
                String address = resultSet.getString("address");
                String marital = resultSet.getString("maritalstatus");
                String education = resultSet.getString("education");
                String hobby = resultSet.getString("hobby");
                
                String district = resultSet.getString("district");
                String height = resultSet.getString("height");
                String weight = resultSet.getString("weight");
                String nationality = resultSet.getString("nationality");
                
                txt_name.setText(username);
                txt_fname.setText(fname);
                txt_mname.setText(mname);
                txt_age.setText(age);
                txt_bday.setText(bday);
                
                txt_email.setText(email);
                txt_mobile.setText(mobile);
                txt_gender.setText(gender);
                txt_religion.setText(religion);
                txt_address.setText(address);
                
                txt_marital.setText(marital);
                txt_education.setText(education);
                txt_hobby.setText(hobby);
                txt_district.setText(district);
                txt_height.setText(height);
                
                txt_weight.setText(weight);
                txt_nationality.setText(nationality);
                
               byte[] imageData = resultSet.getBytes("image");

                // Convert the byte array into an Image
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageData);
                BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
                //ImageIcon imageIcon = new ImageIcon(bufferedImage);
                int width = 115; // Set your desired width
                //int height = 98; // Set your desired height
                    int hight=140;
                // Resize the image
                Image resizedImage = bufferedImage.getScaledInstance(width,hight, Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(resizedImage);
                btn_pic.setIcon(imageIcon);
                
                //String address = resultSet.getString("address");
                //model.addRow(new Object[]{id, username, age}); 
                  
              
            } 
            //table=jTable;

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
           /* 
            JFrame frame = new JFrame("Data in JTable");
           // frame.add(new JScrollPane(jTable));
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            */
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
      
    }                                    

        
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        txt_name = new javax.swing.JButton();
        txt_fname = new javax.swing.JButton();
        txt_mname = new javax.swing.JButton();
        txt_religion = new javax.swing.JButton();
        txt_bday = new javax.swing.JButton();
        txt_gender = new javax.swing.JButton();
        txt_age = new javax.swing.JButton();
        txt_weight = new javax.swing.JButton();
        txt_district = new javax.swing.JButton();
        txt_address = new javax.swing.JButton();
        txt_height = new javax.swing.JButton();
        txt_mobile = new javax.swing.JButton();
        txt_email = new javax.swing.JButton();
        txt_education = new javax.swing.JButton();
        txt_marital = new javax.swing.JButton();
        txt_nationality = new javax.swing.JButton();
        txt_hobby = new javax.swing.JButton();
        btn_pic = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1672, 863));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        jLabel1.setText("VIEW PROFILE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FATHER'S NAME");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MOTHER'S NAME");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BIRTHDAY");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGE");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GENDER");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RELIGION");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DISTRICT");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADDRESS");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("WEIGHT");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("HEIGHT");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MOBILE");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NATIONALITY");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("EMAIL");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MARITAL STATUS");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("EDUCATIONAL STATUS");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("HOBBY");

        btn_back.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btn_back.setLabel("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        txt_name.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_name.setLabel("BACK");
        txt_name.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_fname.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_fname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_fname.setLabel("BACK");
        txt_fname.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_mname.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_mname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_mname.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_mname.setLabel("BACK");
        txt_mname.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_religion.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_religion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_religion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_religion.setLabel("BACK");
        txt_religion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_religion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_religionActionPerformed(evt);
            }
        });

        txt_bday.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_bday.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_bday.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_bday.setIconTextGap(0);
        txt_bday.setLabel("BACK");
        txt_bday.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_gender.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_gender.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_gender.setIconTextGap(0);
        txt_gender.setLabel("BACK");
        txt_gender.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_age.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_age.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_age.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_age.setIconTextGap(0);
        txt_age.setLabel("BACK");
        txt_age.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });

        txt_weight.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_weight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_weight.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_weight.setIconTextGap(0);
        txt_weight.setLabel("BACK");
        txt_weight.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_weightActionPerformed(evt);
            }
        });

        txt_district.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_district.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_district.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_district.setLabel("BACK");
        txt_district.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_district.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_districtActionPerformed(evt);
            }
        });

        txt_address.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_address.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_address.setLabel("BACK");
        txt_address.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        txt_height.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_height.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_height.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_height.setLabel("BACK");
        txt_height.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_heightActionPerformed(evt);
            }
        });

        txt_mobile.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_mobile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_mobile.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_mobile.setLabel("BACK");
        txt_mobile.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobileActionPerformed(evt);
            }
        });

        txt_email.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_email.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_email.setLabel("BACK");
        txt_email.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_education.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_education.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_education.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_education.setLabel("BACK");
        txt_education.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_educationActionPerformed(evt);
            }
        });

        txt_marital.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_marital.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_marital.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_marital.setLabel("BACK");
        txt_marital.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_marital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maritalActionPerformed(evt);
            }
        });

        txt_nationality.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_nationality.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_nationality.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_nationality.setLabel("BACK");
        txt_nationality.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nationalityActionPerformed(evt);
            }
        });

        txt_hobby.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_hobby.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_hobby.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        txt_hobby.setLabel("BACK");
        txt_hobby.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txt_hobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hobbyActionPerformed(evt);
            }
        });

        btn_pic.setText("jButton1");
        btn_pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_picActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_marital, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_hobby, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(43, 43, 43))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                        .addComponent(txt_district, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_religion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_mname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_bday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_fname, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                            .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_education, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(213, 505, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_back)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_weight)
                                    .addComponent(txt_height, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_age))))
                        .addGap(274, 274, 274))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fname)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_age)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txt_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_religion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txt_district, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mobile))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_email)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_nationality))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_education))
                                .addGap(18, 18, 18)
                                .addComponent(txt_marital))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_height))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_weight)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hobby))
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btn_back)
                        .addGap(100, 100, 100))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_religionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_religionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_religionActionPerformed

    private void txt_districtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_districtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_districtActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_heightActionPerformed

    private void txt_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobileActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_educationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_educationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_educationActionPerformed

    private void txt_maritalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maritalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maritalActionPerformed

    private void txt_nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nationalityActionPerformed

    private void txt_hobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hobbyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hobbyActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
             setVisible(false); 
     
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_picActionPerformed
        // TODO add your handling code here:
         new Profilepic(id);
    }//GEN-LAST:event_btn_picActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void txt_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_weightActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Searchviewp0rofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searchviewp0rofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searchviewp0rofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searchviewp0rofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searchviewp0rofile(12).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_pic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton txt_address;
    private javax.swing.JButton txt_age;
    private javax.swing.JButton txt_bday;
    private javax.swing.JButton txt_district;
    private javax.swing.JButton txt_education;
    private javax.swing.JButton txt_email;
    private javax.swing.JButton txt_fname;
    private javax.swing.JButton txt_gender;
    private javax.swing.JButton txt_height;
    private javax.swing.JButton txt_hobby;
    private javax.swing.JButton txt_marital;
    private javax.swing.JButton txt_mname;
    private javax.swing.JButton txt_mobile;
    private javax.swing.JButton txt_name;
    private javax.swing.JButton txt_nationality;
    private javax.swing.JButton txt_religion;
    private javax.swing.JButton txt_weight;
    // End of variables declaration//GEN-END:variables
}
