/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui.User;

import Entity.User;
import Services.ServiceUser;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.Style;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class DisplayUser extends Form{
    public DisplayUser(){
        setTitle("Liste des utilisateurs");
        setLayout(BoxLayout.yCenter());
        ArrayList<User> users = ServiceUser.getInstance().getAllUsers();
        System.out.println(users);

        for( User user: users) {

            Container card = new Container(new BorderLayout());
            card.getStyle().setBorder(Border.createLineBorder(1, ColorUtil.GRAY));
            card.getStyle().setMarginUnit(Style.UNIT_TYPE_DIPS);
            card.getStyle().setMargin(Component.BOTTOM, 2);
            card.getStyle().setBgColor(0xFFFFFF);
            System.out.println(user.getId_user());
            Label id = new Label("ID: " + user.getId_user());
            Label nom = new Label("Nom" + user.getNom());
            Label prenom = new Label("Prénom" + user.getPrenom());
            Label username = new Label("Usernale" + user.getUsername());
            Label email = new Label("E-mail" + user.getEmail());
            Label num_tel = new Label("Numéro téléphone" + user.getNum_tel());
            Label cin = new Label("CIN" + user.getCin());
          //  Label role = new Label("Nom" + user.getRole().getNom());
            id.getStyle().setFgColor(0x000000);
            nom.getStyle().setFgColor(0x000000);
            prenom.getStyle().setFgColor(0x000000);
            username.getStyle().setFgColor(0x000000);
            email.getStyle().setFgColor(0x000000);
            num_tel.getStyle().setFgColor(0x000000);
            cin.getStyle().setFgColor(0x000000);
            //role.getStyle().setFgColor(0x000000);
            card.add(BorderLayout.CENTER, BoxLayout.encloseY(num_tel));
          //  card.add(BorderLayout, cin);
            card.addAll(id,nom,prenom,username,email,num_tel);
            //card.add(BorderLayout.NORTH, role);
            
            Button supp = new Button("Supprimer");
            Button modif = new Button("Modifer");
            card.add(BorderLayout.CENTER, supp);
            card.add(BorderLayout.CENTER, modif);
            //addAll(card,supp, modif)s
            this.add(card);
        }

    }
    
}

    