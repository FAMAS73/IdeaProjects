public class ERProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector =new HospitalManagement();
        Employee peggy=new Nurse(1,"Pegge","Emergency",true);

        ERDirector.callUpon(peggy);

        Employee suzan=new Doctor(2,"Suzan","Emergency",true);

        ERDirector.callUpon(suzan);
    }
}
