package com.mytest.testweb_package.testmybatis;

import com.mytest.testweb_package.testmybatis;

public class Student extends testmybatis {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.incre_stu_id
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.stu_id
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    private String stuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.stu_name
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    private String stuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.gender
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    private String gender;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.incre_stu_id
     *
     * @return the value of student.incre_stu_id
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.incre_stu_id
     *
     * @param id the value for student.incre_stu_id
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.stu_id
     *
     * @return the value of student.stu_id
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.stu_id
     *
     * @param stuId the value for student.stu_id
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.stu_name
     *
     * @return the value of student.stu_name
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.stu_name
     *
     * @param stuName the value for student.stu_name
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.gender
     *
     * @return the value of student.gender
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.gender
     *
     * @param gender the value for student.gender
     *
     * @mbg.generated Fri Aug 28 12:20:02 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}