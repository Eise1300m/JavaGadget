class User {

        private String Username;
        private String Password;
        private int Contact;
        private String Email;

        public User(){}

        public User(String name, String pass) {

            this.Username = name;
            this.Password = pass;
        }
    
        public void setUsername( String name){
            this.Username = name;
        }

        public void setPassword (String password){
            this.Password = password;
        }

        public String getUsername(){
            return Username;
        }

        public String getpasword(){
            return Password;
        }
        
        // public String toString(){
        //     return Username + " " + Password + " " + Contact + " " + Email;
        // }

}

class Seller extends User {

    private int Seller_ID;
    private String Storename;
    private Product product;

    public Seller(){}

    public Seller( int seller_id, String storename , Product product){

        this.Seller_ID = seller_id;
        this.Storename = storename;
        this.product = product;
    }



}

class customer extends User{

    private int Customer_ID;
    private String Address;
    private String Name;

    public customer(){}

    public customer(int customer_id, String address, String name){

        this.Customer_ID = customer_id;
        this.Address = address;
        this.Name = name;
    }

}

