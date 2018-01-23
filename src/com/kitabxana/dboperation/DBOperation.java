package com.kitabxana.dboperation;

import com.kitabxana.model.AddKitabxana;
import com.kitabxana.model.BookSort;
import com.kitabxana.model.LoginStudent;
import com.kitabxana.model.NowLoginStudent;
import com.kitabxana.model.UnivercityStudent;
import com.kitabxana.model.UnivercityWorker;
import com.mysql.jdbc.Driver;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBOperation {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private void connect() {

        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kitabxana", "root", "admin");
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void close() {

        try {
            if (!conn.isClosed()) {
                conn.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertStudent(UnivercityStudent student) {

        connect();
        try {
            ps = conn.prepareStatement("insert into univercity_student values(0,?,?,?,?,?,?,?)");
            ps.setString(1, student.getName());
            ps.setString(2, student.getSurname());
            ps.setString(3, student.getFatherName());
            ps.setString(4, student.getAge());
            ps.setString(5, student.getTbSeriaNumber());
            ps.setString(6, student.getEpoct());
            ps.setString(7, student.getMobilPhone());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void deleteStudentByID(UnivercityStudent student) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE FROM univercity_student where id=(" + student.getId() + ")");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<UnivercityStudent> allUnivercityStudent() {
        List<UnivercityStudent> students = new ArrayList();
        connect();
        try {
            ps = conn.prepareStatement("select * from univercity_student");
            rs = ps.executeQuery();
            while (rs.next()) {
                UnivercityStudent us = new UnivercityStudent();
                us.setId(rs.getInt("id"));
                us.setName(rs.getString("name"));
                us.setSurname(rs.getString("surname"));
                us.setAge(rs.getString("age"));
                us.setFatherName(rs.getString("father_name"));
                us.setMobilPhone(rs.getString("mobil_number"));
                us.setTbSeriaNumber(rs.getString("tb_seria_number"));
                us.setEpoct(rs.getString("e_poct"));
                students.add(us);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return students;

    }

    public void insertBook(AddKitabxana book) {

        connect();
        try {
            ps = conn.prepareStatement("insert into kitabxana_book values(0,?,?,?,?,?,?,?)");
            ps.setString(1, book.getBookName());
            ps.setString(2, book.getYaziciName());
            ps.setString(3, book.getBookSort());
            ps.setString(4, book.getRefNumber());
            ps.setString(5, book.getSiraNumber());
            ps.setString(6, book.getSutunNumber());
            ps.setString(7, book.getBookAbout());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }

    }

    public void insertLoginStudents(LoginStudent student) {

        try {
            connect();
            ps = conn.prepareStatement("insert into login_student values(0,?,?,?,?,?,?)");
            ps.setString(1, student.getName());
            ps.setString(2, student.getSurname());
            ps.setString(3, student.getFatherName());
            ps.setString(4, student.getAge());
            ps.setString(5, student.getTbSeriaNumber());
            ps.setString(6, student.getPassword());
            

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<LoginStudent> allLoginStudets() {
        List<LoginStudent> listLogin = new ArrayList();

        connect();
        try {

            ps = conn.prepareStatement("select * from login_student");
            rs = ps.executeQuery();
            while (rs.next()) {
                LoginStudent login = new LoginStudent();
                login.setId(rs.getInt("id"));
                login.setName(rs.getString("name"));
                login.setSurname(rs.getString("surname"));
                login.setFatherName(rs.getString("father_name"));
                login.setAge(rs.getString("age"));
                
                login.setTbSeriaNumber(rs.getString("tb_seria_number"));
                
                listLogin.add(login);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }

        return listLogin;

    }

    public List<LoginStudent> allSelectLoginStudets() {
        List<LoginStudent> listLogin = new ArrayList();

        connect();
        try {

            ps = conn.prepareStatement("select * from login_student");
            rs = ps.executeQuery();
            while (rs.next()) {
                LoginStudent login = new LoginStudent();
                login.setId(rs.getInt("id"));
                login.setName(rs.getString("name"));
                login.setSurname(rs.getString("surname"));
                login.setAge(rs.getString("age"));
                login.setFatherName(rs.getString("father_name"));
                login.setTbSeriaNumber(rs.getString("tb_seria_number"));
                login.setPassword(rs.getString("password"));
                listLogin.add(login);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }

        return listLogin;

    }

    public void deleteLoginStudentByID(LoginStudent login) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE FROM login_student where id=(" + login.getId() + ")");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void insertWorker(UnivercityWorker worker) {

        connect();
        try {
            ps = conn.prepareStatement("insert into univercity_worker values(0,?,?,?,?,?,?,?,?)");
            ps.setString(1, worker.getName());
            ps.setString(2, worker.getSurname());
            ps.setString(3, worker.getFatherName());
            ps.setString(4, worker.getAge());
            ps.setString(5, worker.getWorkerCode());
            ps.setString(6, worker.getPassword());
            ps.setString(7, worker.getePoct());
            ps.setString(8, worker.getMobuilNumber());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void deleteWorkerByID(UnivercityWorker worker) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE FROM univercity_worker where id=(" + worker.getId() + ")");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<UnivercityWorker> allUnivercityWorker() {
        List<UnivercityWorker> workers = new ArrayList();
        connect();
        try {
            ps = conn.prepareStatement("select * from univercity_worker");
            rs = ps.executeQuery();
            while (rs.next()) {
                UnivercityWorker uw = new UnivercityWorker();
                uw.setId(rs.getInt("id"));
                uw.setName(rs.getString("name"));
                uw.setSurname(rs.getString("surname"));
                uw.setAge(rs.getString("age"));
                uw.setFatherName(rs.getString("father_name"));
                uw.setMobuilNumber(rs.getString("mobil_number"));
                uw.setWorkerCode(rs.getString("worker_code"));
                uw.setPassword(rs.getString("password"));
                uw.setePoct(rs.getString("e_poct"));
                workers.add(uw);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return workers;

    }

    public List<AddKitabxana> allBook() {
        List<AddKitabxana> books = new ArrayList();
        connect();
        try {
            ps = conn.prepareStatement("select * from kitabxana_book");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddKitabxana book = new AddKitabxana();
                book.setId(rs.getInt("id"));
                book.setBookName(rs.getString("book_name"));
                book.setYaziciName(rs.getString("yazici_name"));
    
                book.setBookSort(rs.getString("book_sort"));
                book.setRefNumber(rs.getString("ref_number"));
                book.setSiraNumber(rs.getString("sira_number"));
                book.setSutunNumber(rs.getString("sutun_number"));
                book.setBookAbout(rs.getString("book_about"));
                

                books.add(book);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return books;

    }
    
    public List<AddKitabxana> allBookSelectLikeWhereBookName(String text) {
        List<AddKitabxana> books = new ArrayList();
        connect();
        AddKitabxana book = new AddKitabxana();
        try {
            ps = conn.prepareStatement("select * from kitabxana_book where upper(book_name) like '%"+text+"%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                
                book.setId(rs.getInt("id"));
                book.setBookName(rs.getString("book_name"));
                book.setYaziciName(rs.getString("yazici_name"));
    
                book.setBookSort(rs.getString("book_sort"));
                book.setRefNumber(rs.getString("ref_number"));
                book.setSiraNumber(rs.getString("sira_number"));
                book.setSutunNumber(rs.getString("sutun_number"));
                book.setBookAbout(rs.getString("book_about"));
                

                books.add(book);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return books;

    }

    public List<AddKitabxana> allBookSelectLikeWhereYaziciName(String text) {
        List<AddKitabxana> books = new ArrayList();
        connect();
        AddKitabxana book = new AddKitabxana();
        try {
            ps = conn.prepareStatement("select * from kitabxana_book where upper(yazici_name) like '%"+text+"%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                
                book.setId(rs.getInt("id"));
                book.setBookName(rs.getString("book_name"));
                book.setYaziciName(rs.getString("yazici_name"));
    
                book.setBookSort(rs.getString("book_sort"));
                book.setRefNumber(rs.getString("ref_number"));
                book.setSiraNumber(rs.getString("sira_number"));
                book.setSutunNumber(rs.getString("sutun_number"));
                book.setBookAbout(rs.getString("book_about"));
                

                books.add(book);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return books;

    }

    public void updateBooksByID(AddKitabxana book) {

        connect();
        try {
            ps = conn.prepareStatement("update kitabxana_book set yazici_name='" + book.getYaziciName() + "', book_name='" + book.getBookName() + "', book_sort='" + book.getBookSort() + "', ref_number='" + book.getRefNumber() + "', sira_number='" + book.getSiraNumber() + "', sutun_number='" + book.getSutunNumber() + "',book_about='" + book.getBookAbout()+ "' where id ='" + book.getId() + "'");

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void deleteBookByID(AddKitabxana book) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE FROM kitabxana_book where id=(" + book.getId() + ")");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void insertBookSort(BookSort sort) {

        connect();

        try {
            ps = conn.prepareStatement("insert into book_sort values(0,?)");
            ps.setString(1, sort.getBookSortName());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            close();
        }

    }

    public List<BookSort> allBookSort() {

        List<BookSort> sorts = new ArrayList();
        connect();
        try {

            ps = conn.prepareStatement("select * from book_sort");
            rs = ps.executeQuery();
            while (rs.next()) {
                BookSort bookSort = new BookSort();
                bookSort.setId(rs.getInt("id"));
                bookSort.setBookSortName(rs.getString("book_sort_name"));
                sorts.add(bookSort);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return sorts;

    }

    public void deleteBookSortByName(BookSort sort) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE  FROM book_sort where book_sort_name=('" + sort.getBookSortName() + "')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void insertBookSortName(BookSort sort) {

        connect();

        try {
            ps = conn.prepareStatement("insert into book_sort_name values(0,?)");
            ps.setString(1, sort.getBookSortName());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            close();
        }

    }

    public List<BookSort> allBookSortName() {

        List<BookSort> sorts = new ArrayList();
        connect();
        try {

            ps = conn.prepareStatement("select * from book_sort_name");
            rs = ps.executeQuery();
            while (rs.next()) {
                BookSort bookSort = new BookSort();
                bookSort.setId(rs.getInt("id"));
                bookSort.setBookSortName(rs.getString("book_sort_name"));
                sorts.add(bookSort);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return sorts;
        
    }
    
    public void insertReadBook(NowLoginStudent nls) {

        connect();

        try {
            ps = conn.prepareStatement("insert into now_login_student values(0,?,?,?,?,?)");
            ps.setString(1, nls.getName());
            ps.setString(2, nls.getSurname());
            ps.setString(3, nls.getTbSeriaNumber());
            ps.setString(4, nls.getYaziciName());
            ps.setString(5, nls.getBookName());
  
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            close();
        }

    }

    public void deleteReadBookByStudentId(NowLoginStudent nls) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE  FROM now_login_student where tb_seria_number=('" + nls.getTbSeriaNumber()+ "')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<NowLoginStudent> allReadBook() {

        List<NowLoginStudent> books = new ArrayList();
        connect();
        try {

            ps = conn.prepareStatement("select * from now_login_student");
            rs = ps.executeQuery();
            while (rs.next()) {
                NowLoginStudent student = new NowLoginStudent();
                student.setId(rs.getInt("id"));
                student.setYaziciName(rs.getString("yazici_name"));
                student.setBookName(rs.getString("book_name"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setTbSeriaNumber(rs.getString("tb_seria_number"));
                
                books.add(student);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return books;

    }

}