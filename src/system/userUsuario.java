/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author aline
 */
class userUsuario {
    
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String hairdresser;
    private String hcomments;

    
    public userUsuario(String email, String senha){
        this.email = email;
        this.password = senha;
    }
    
    public userUsuario(String name, String email, String address, String phone, String password){
       this.name = name; 
       this.email = email;
       this.address = address;
       this.phone = phone;
       this.password = password;
       this.hairdresser = hairdresser; 
    }

    userUsuario(String hairdresser, String Comment, String nada) {
        
       this.hairdresser = hairdresser; 
       this.hcomments = hcomments;
    }

    
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
     public String getAddress() {
        return address;
    }
     
     public String getPhone() {
        return phone;
    }
    
    public String getPassword() {
        return password;
    }
    
    
    public String getHairdresser(){
        return hairdresser;
    }
    
    public String getComments(){
        return hcomments;
    }
    

 

}

