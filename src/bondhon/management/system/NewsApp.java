package bondhon.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NewsApp extends JFrame {
    
    int id2;

    private JTextArea resultTextArea=new JTextArea();;

    public NewsApp(int id) {
        id2=id;
        setTitle("News App");
        setSize(1600, 830);
        setBounds(0,0,1600,830);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //resultTextArea.setBackground(green);
        setVisible(true);
        resultTextArea.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        resultTextArea.setForeground(new java.awt.Color(153, 153, 0));
        resultTextArea.setBackground(new java.awt.Color(0, 53, 53));
        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(1600, 830));
        scrollPane.setBackground(new java.awt.Color(153, 153, 0));
        
        resultTextArea.setEditable(false);
        
        try {
                    String apiUrl = "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=350dd6995dbb454db981c5b3354e1177";
                    String jsonData = readJsonFromUrl(apiUrl);
            
                    
                    //String jsonData = readJsonFromUrl(apiUrl);

                    // Parse JSON and display information
                    displayNews(jsonData);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        
        //fetchAndShowNews();

        
        
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setVisible(false); 
             Dashboard dashFrame=new Dashboard(id2);
             dashFrame.setVisible(true);
             dashFrame.pack();
             dashFrame.setLocationRelativeTo(null);
               
            }
        });
        //fetchAndShowNews();
        JPanel buttonPanel = new JPanel();
       // buttonPanel.add(showButton);
        buttonPanel.add(back);
        getContentPane().setBackground(new java.awt.Color(53, 53, 0));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    

    private String readJsonFromUrl(String url) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream(), StandardCharsets.UTF_8))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        }
    }

    private void displayNews(String jsonData) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Parse JSON and extract information for display
                JSONObject json = null;
                try {
                    json = new JSONObject(jsonData);
                } catch (JSONException ex) {
                    Logger.getLogger(NewsApp.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if ("ok".equals(json.getString("status"))) {
                        JSONArray articles = null;
                        try {
                            articles = json.getJSONArray("articles");
                        } catch (JSONException ex) {
                            Logger.getLogger(NewsApp.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        StringBuilder resultBuilder = new StringBuilder();
                        
                        for (int i = 0; i < articles.length(); i++) {
                            JSONObject article = articles.getJSONObject(i);
                            resultBuilder.append("Title: ").append(article.getString("title")).append("\n");
                            resultBuilder.append("Author: ").append(article.getString("author")).append("\n");
                            resultBuilder.append("Description: ").append(article.getString("description")).append("\n");
                            resultBuilder.append("Published At: ").append(article.getString("publishedAt")).append("\n");
                            resultBuilder.append("Content: ").append(article.getString("content")).append("\n");
                            resultBuilder.append("\n--------------------------------------------\n\n");
                        }
                        
                        
                        resultTextArea.setText(resultBuilder.toString());
                        resultTextArea.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
                        //resultTextArea.setForeground(new java.awt.Color(0, 51, 51));
                        //resultTextArea.setBackground(new java.awt.Color(153, 153, 0));
                    } else {
                        resultTextArea.setText("Error fetching news data.");
                    }
                } catch (JSONException ex) {
                    Logger.getLogger(NewsApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewsApp(5);//.setVisible(true);
            }
        });
    }
}

