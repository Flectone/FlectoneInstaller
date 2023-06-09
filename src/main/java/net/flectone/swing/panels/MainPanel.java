/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package net.flectone.swing.panels;

import net.flectone.swing.comboboxes.CustomCombobox;
import net.flectone.swing.frames.SettingsFrame;
import net.flectone.swing.labels.BottomLabel;
import net.flectone.swing.panels.tabs.*;
import net.flectone.system.Configuration;
import net.flectone.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TheFaser
 */
public class MainPanel extends JPanel {

    /**
     * Creates new form FPanel
     */
    private final Map<Integer, JPanel> listPanels = new HashMap<>();


    public MainPanel() {

        initComponents();
        updateUI();

        EmptyPanel panel = new OptimizationPanel().panel;
        listPanels.put(0, panel);
        componentsPanel.add(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componentsPanel = new JPanel();
        panelRound1 = new JPanel();
        settingsPanel = new JPanel();

        themeLabel = new BottomLabel("theme_black.png");

        themeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                SwingUtils.theme = (SwingUtils.theme.equals("black")) ? "white" : "black";
                // DON'T REMOVE IMAGEICON
                themeLabel.setIcon(new ImageIcon(IOUtils.getThemeBufferedImage("theme_" + SwingUtils.theme + ".png", SwingUtils.getColor(2))));
                SwingUtils.setColors(ColorUtils.decode("color." + SwingUtils.theme));
            }
        });
        settingsLabel = new BottomLabel("settings.png");
        urlsPanel = new JPanel();
        discordLabel = new BottomLabel("discord.png", true);
        youtubeLabel = new BottomLabel("youtube.png", true);
        githubLabel = new BottomLabel("github.png", true);
        authorLabel = new JLabel();

        tabCombobox = createTabCombobox();

        setPreferredSize(new Dimension(900, 500));

        componentsPanel.setOpaque(false);
        componentsPanel.setLayout(new BoxLayout(componentsPanel, BoxLayout.LINE_AXIS));

        settingsPanel.setOpaque(false);

        settingsLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                new SettingsFrame();
            }
        });

        GroupLayout settingsPanelLayout = new GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(themeLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(themeLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        urlsPanel.setOpaque(false);

        authorLabel.setFont(IOUtils.getResourceFont("acumin.TTF", 9));
        authorLabel.setText("BY THEFASER");
        authorLabel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                IOUtils.openUrl(Configuration.getValue("url.author"));
            }
        });

        GroupLayout urlsPanelLayout = new GroupLayout(urlsPanel);
        urlsPanel.setLayout(urlsPanelLayout);
        urlsPanelLayout.setHorizontalGroup(
            urlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(urlsPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(discordLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(youtubeLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(githubLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorLabel)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        urlsPanelLayout.setVerticalGroup(
            urlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(urlsPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(urlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, urlsPanelLayout.createSequentialGroup()
                        .addGroup(urlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(githubLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                            .addComponent(youtubeLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                            .addComponent(discordLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(GroupLayout.Alignment.TRAILING, urlsPanelLayout.createSequentialGroup()
                        .addComponent(authorLabel)
                        .addContainerGap())))
        );

        GroupLayout panelRound1Layout = new GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabCombobox, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(urlsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE)
                .addComponent(settingsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(settingsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(urlsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(tabCombobox)
                .addGap(8, 8, 8))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(componentsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRound1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(componentsPanel, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelRound1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private JComboBox<String> createTabCombobox(){
        CustomCombobox comboBox = new CustomCombobox();

        Map<String, Icon> icons = new HashMap<>();
        for(String tab : Configuration.getValues("menu.list")){
            comboBox.addItem(Configuration.getValue("menu." + tab));

            // DON'T REMOVE IMAGEICON
            icons.put(Configuration.getValue("menu." + tab), new ImageIcon(IOUtils.getThemeBufferedImage(tab + ".png", SwingUtils.getColor(2))));
        }

        comboBox.setIconListRenderer(icons);

        comboBox.addActionListener(e -> {

            int tabIndex = comboBox.getSelectedIndex();
            JPanel panel = listPanels.get(tabIndex);
            if(panel == null) {

                switch (tabIndex){
                    case 0: panel = new OptimizationPanel().panel; break;
                    case 1: panel = new FarmsPanel().panel; break;
                    case 2: panel = new PluginsPanel().panel; break;
                    case 3: panel = new ModsPanel().panel; break;
                    case 4: panel = new DatapacksPanel().panel; break;
                    case 5: panel = new ResourcepacksPanel().panel; break;
                    case 6: panel = new ShadersPanel().panel; break;
                    default: panel = new JPanel();
                }
                listPanels.put(tabIndex, panel);
            }

            componentsPanel.removeAll();

            SwingUtilities.updateComponentTreeUI(panel);

            componentsPanel.add(panel);

            EmptyScrollPanel.update();

            updateUI();
        });

        return comboBox;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel authorLabel;
    private JPanel componentsPanel;
    private JLabel discordLabel;
    private JLabel githubLabel;
    private JPanel panelRound1;
    private JLabel settingsLabel;
    private JPanel settingsPanel;
    private JComboBox<String> tabCombobox;
    private JLabel themeLabel;
    private JPanel urlsPanel;
    private JLabel youtubeLabel;
    // End of variables declaration//GEN-END:variables
}
