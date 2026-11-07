class Student {
    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Shoaib");

        System.out.println(s1.getName());
    }
}