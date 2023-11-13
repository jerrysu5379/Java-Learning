public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "张三", 20);
        Student s2 = new Student(2, "李四", 21);
        Student s3 = new Student(3, "王五", 22);
        Student s4 = new Student(4, "赵六", 23);
        Student s5 = new Student(5, "孙七", 24);
        Student s6 = new Student(6, "周八", 25);
        Student s7 = new Student(7, "吴九", 26);
        Student s8 = new Student(8, "郑十", 27);
        Student s9 = new Student(9, "钱十一", 28);
        Student s10 = new Student(10, "黄十二", 29);
        Student[] students = new Student[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        Teacher t1 = new Teacher(1, "张老师", 30);
        Teacher t2 = new Teacher(2, "李老师", 31);
        Teacher t3 = new Teacher(3, "王老师", 32);
        Teacher t4 = new Teacher(4, "赵老师", 33);
        Teacher t5 = new Teacher(5, "孙老师", 34);
        Teacher[] teachers = new Teacher[]{t1, t2, t3, t4, t5};
        Lesson l1 = new Lesson(1, "语文", 1);
        Lesson l2 = new Lesson(2, "数学", 2);
        Lesson l3 = new Lesson(3, "英语", 3);
        Lesson l4 = new Lesson(4, "物理", 4);
        Lesson l5 = new Lesson(5, "化学", 5);
        Lesson[] lessons = new Lesson[]{l1, l2, l3, l4, l5};
        System.out.println("学生年龄最大值为：" + Student.getFMax(students));
        System.out.println("学生年龄次大值为：" + Student.getSMax(students));
        System.out.println("教师年龄最大值为：" + Teacher.getFMax(teachers));
        System.out.println("教师年龄次大值为：" + Teacher.getSMax(teachers));
        System.out.println("课程学分最大值为：" + Lesson.getFMax(lessons));
        System.out.println("课程学分次大值为：" + Lesson.getSMax(lessons));
        System.out.println("学生信息：");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("教师信息：");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("课程信息：");
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }

    static class Student {
        private int sID;
        private String sName;
        private int sAge;
        private static int count = 0;

        public Student() {
            sID = ++count;
        }

        public Student(int sID, String sName, int sAge) {
            this.sID = sID;
            this.sName = sName;
            this.sAge = sAge;
            count++;
        }

        public int getsID() {
            return sID;
        }

        public String getsName() {
            return sName;
        }

        public int getsAge() {
            return sAge;
        }

        public void setsID(int sID) {
            this.sID = sID;
        }

        public void setsName(String sName) {
            this.sName = sName;
        }

        public void setsAge(int sAge) {
            this.sAge = sAge;
            count++;
        }

        public static int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "学号=" + sID +
                    ", 姓名='" + sName + '\'' +
                    ", 年龄=" + sAge;
        }

        public static int getFMax(Student[] students) {
            int max = students[0].getsAge();
            for (int i = 1; i < students.length; i++) {
                if (students[i].getsAge() > max) {
                    max = students[i].getsAge();
                }
            }
            return max;
        }

        public static int getSMax(Student[] students) {
            int max = students[0].getsAge();
            int sMax = students[0].getsAge();
            for (int i = 1; i < students.length; i++) {
                if (students[i].getsAge() > max) {
                    sMax = max;
                    max = students[i].getsAge();
                } else if (students[i].getsAge() > sMax) {
                    sMax = students[i].getsAge();
                }
            }
            return sMax;
        }
    }

    static class Teacher {
        private int tID;
        private String tName;
        private int tAge;
        private static int count = 0;

        public Teacher() {
            tID = ++count;
        }

        public Teacher(int tID, String tName, int tAge) {
            this.tID = tID;
            this.tName = tName;
            this.tAge = tAge;
            count++;
        }

        public int gettID() {
            return tID;
        }

        public String gettName() {
            return tName;
        }

        public int gettAge() {
            return tAge;
        }

        public void settID(int tID) {
            this.tID = tID;
        }

        public void settName(String tName) {
            this.tName = tName;
        }

        public void settAge(int tAge) {
            this.tAge = tAge;
            count++;
        }

        public static int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "教师编号=" + tID +
                    ", 姓名='" + tName + '\'' +
                    ", 年龄=" + tAge;
        }

        public static int getFMax(Teacher[] teachers) {
            int max = teachers[0].gettAge();
            for (int i = 1; i < teachers.length; i++) {
                if (teachers[i].gettAge() > max) {
                    max = teachers[i].gettAge();
                }
            }
            return max;
        }

        public static int getSMax(Teacher[] teachers) {
            int max = teachers[0].gettAge();
            int sMax = teachers[0].gettAge();
            for (int i = 1; i < teachers.length; i++) {
                if (teachers[i].gettAge() > max) {
                    sMax = max;
                    max = teachers[i].gettAge();
                } else if (teachers[i].gettAge() > sMax) {
                    sMax = teachers[i].gettAge();
                }
            }
            return sMax;
        }
    }

    static class Lesson {
        private int lID;
        private String lName;
        private int lCredit;
        private static int count = 0;

        public Lesson() {
            lID = ++count;
        }

        public Lesson(int lID, String lName, int lCredit) {
            this.lID = lID;
            this.lName = lName;
            this.lCredit = lCredit;
            count++;
        }

        public int getlID() {
            return lID;
        }

        public String getlName() {
            return lName;
        }

        public int getlCredit() {
            return lCredit;
        }

        public void setlID(int lID) {
            this.lID = lID;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public void setlCredit(int lCredit) {
            this.lCredit = lCredit;
            count++;
        }

        public static int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return  "课程编号=" + lID +
                    ", 课程名称='" + lName + '\'' +
                    ", 学分=" + lCredit;
        }

        public static int getFMax(Lesson[] lessons) {
            int max = lessons[0].getlCredit();
            for (int i = 1; i < lessons.length; i++) {
                if (lessons[i].getlCredit() > max) {
                    max = lessons[i].getlCredit();
                }
            }
            return max;
        }

        public static int getSMax(Lesson[] lessons) {
            int max = lessons[0].getlCredit();
            int sMax = lessons[0].getlCredit();
            for (int i = 1; i < lessons.length; i++) {
                if (lessons[i].getlCredit() > max) {
                    sMax = max;
                    max = lessons[i].getlCredit();
                } else if (lessons[i].getlCredit() > sMax) {
                    sMax = lessons[i].getlCredit();
                }
            }
            return sMax;
        }
    }
}