public class main {
    public static void main(String[] args) {
                Person Sin = new Person("Sd", "DS", 33, 'm');
                Pet Kat = new Pet("Soro", 3, "Britste Korthaar");
                Sin.addPet(Kat);
        System.out.println(Sin.getPets());
    }
}
