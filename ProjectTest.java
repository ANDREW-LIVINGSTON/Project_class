class ProjectTest {
    public static void main(String[] args) {
        Project abc = new Project();
        abc.setName("proj1");
        abc.setDescription("is a project");
        String projName = abc.getName();
        String projDescription = abc.getDescription();
        System.out.println(projName + ":" + projDescription);
    }
}