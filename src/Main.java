public class Main{
    public static void main(String[] args) {
        Client client = new Client();
        String name = "dowglasSantos";
        String email = "douglasdossantos1337@gmail.com";
        String password = "Douglas#123";

        client.setName(name);
        client.setEmail(email);
        client.setPassword(password);

        System.out.println("Nome do cliente: " + client.getName());
        System.out.println("Email do cliente: " + client.getEmail());
        System.out.println("Senha do cliente: " + client.getPassword());
    };
}