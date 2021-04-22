/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrationRole.TrainingEntAdminWorkAreaPanel;
import userinterface.TreasurerRole.TreasurerWorkAreaJPanel;

/**
 *
 * @author Deepika Reddy
 */
public class TreasurerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new TreasurerWorkAreaJPanel(userProcessContainer,account,organization, enterprise, network, business);//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public RoleType getRoleType(){
        return RoleType.Treasurer;
    }
    
}
