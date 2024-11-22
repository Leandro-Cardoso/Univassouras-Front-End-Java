public class User {
    protected String name, password, adress, tel, cep, city, state;

    public User(String name, String password, String adress, String tel, String cep, String city, String state) {
        this.name = name;
        this.password = password;
        this.adress = adress;
        this.tel = tel;
        this.cep = cep;
        this.city = city;
        this.state = state;
    }

    public boolean isValidPassword(String password) {
        return password.equals(this.password) ? true : false;
    }

    public String getName() {
        return this.name;
    }
    
    public String getAdress() {
        return this.adress;
    }

    public String getTel() {
        return this.tel;
    }
    
    public String getCep() {
        return this.cep;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public String getState() {
        return this.state;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return user.name == this.name ? true : false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\nSenha: ******\nEndereco: " + this.adress + "\nTelefone: " + this.tel + "\nCEP: " + this.cep + "\nCidade: " + this.city + "\nEstado: " + this.state;
    }
}
