package Projects.hospital_management_system;

import java.util.Scanner;



    public class Doctor extends DataBank {
        Scanner scan =new Scanner(System.in);

        private  String doctorName;
        private  String surName;
        private  String title;

        public Doctor(String name, String surName, String title){
            this.doctorName =name;
            this.surName =surName;
            this.title =title;
        }
        public Doctor(){

        }

        @Override
        public String toString() {
            return "Doctor{" +
                    "name='" + doctorName + '\'' +
                    ", surName='" + surName + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }

        public String getDoctorName() {
            return doctorName;
        }
        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
}
