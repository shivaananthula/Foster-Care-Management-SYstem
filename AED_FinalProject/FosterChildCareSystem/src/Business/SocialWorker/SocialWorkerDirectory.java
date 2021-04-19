/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SocialWorker;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class SocialWorkerDirectory {
    
    public ArrayList<SocialWorker> SocialWorkerList;

    public SocialWorkerDirectory() {
        this.SocialWorkerList = new ArrayList<SocialWorker>();
    }

    public ArrayList<SocialWorker> getSocialWorkerList() {
        return SocialWorkerList;
    }

    public void setSocialWorkerList(ArrayList<SocialWorker> SocialWorkerList) {
        this.SocialWorkerList = SocialWorkerList;
    }

    
    public void add(SocialWorker socialWorker){
        this.SocialWorkerList.add(socialWorker);
    }
    
    public SocialWorker getSocialWorkerById(int WorkerId){
        for(SocialWorker s : this.SocialWorkerList){
            if(s.getSocialWorkerID()== WorkerId){
                return s;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(SocialWorker socialWorker: this.SocialWorkerList){
            if(socialWorker.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(SocialWorker socialWorker: this.SocialWorkerList){
            if(socialWorker.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateSocialWorker(int id, String Name, String Phone, String address ,String parentEmail ){
        for(SocialWorker socialWorker: this.SocialWorkerList){
            if(socialWorker.getSocialWorkerID()== id){
                socialWorker.setName(Name);
                socialWorker.setPhoneNumber(Phone);
                socialWorker.setAddress(address);
                socialWorker.setEmail(parentEmail);
            }
        }
    }
    
    public void DeleteSocialWorker(int id){
        SocialWorker toDelete = null;
        for(SocialWorker worker: this.SocialWorkerList){
            if(worker.getSocialWorkerID()== id){
                toDelete = worker;
            }
        }
        
        if(toDelete != null){
            this.SocialWorkerList.remove(toDelete);
        }
    }
}
