package service;

import classes.Admin;
import classes.Group;

import java.util.ArrayList;

public interface Lms {
    void getAdmin(ArrayList<Admin> admins);
    Group Addnewgroup();
    void GetGroupByName();
    void UpdateGroupName();
    void UpdateStudent();
    void FindStudentByFirstName();
    void GetAllStudentsByGroupName();
    void GetAllStudentLesson();
    void AddNewLessonToGroup();
    void GetLessonByName();
    void GetAllLessonByGroupName();
    void deleteStudent();
    void deleteLessons();
    void deleteGroup();
    void getAllGroups();
    void addNewStudentToGroup();
}
