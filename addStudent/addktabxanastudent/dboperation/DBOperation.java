package com.addktabxanastudent.dboperation;

import com.addkitabxanastudent.model.AddKitabxana;
import com.addkitabxanastudent.model.BuyBook;
import com.addkitabxanastudent.model.UnivercityStudent;
import com.addkitabxanastudent.model.UnivercityWorker;
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
import com.addkitabxanastudent.model.LoginStudent;
import com.addkitabxanastudent.model.NowLoginStudentDB;

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
                us.setFatherName(rs.getString("father_name"));
                us.setAge(rs.getString("age"));

                us.setTbSeriaNumber(rs.getString("tb_seria_number"));
                us.setEpoct(rs.getString("e_poct"));
                us.setMobilPhone(rs.getString("mobil_number"));
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

            ps.setString(4, book.getBookSort());
            ps.setInt(5, book.getRefNumber());
            ps.setInt(6, book.getSiraNumber());
            ps.setInt(7, book.getSutunNumber());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }

    }

    public void deleteBookByID(AddKitabxana ak) {

        connect();

        try {
            ps = conn.prepareStatement("DELETE FROM kitabxana_book where id=(" + ak.getId() + ")");
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
            ps.setString(4, student.getTbSeriaNumber());
            ps.setString(5, student.getPassword());
            ps.setString(6, student.getAge());

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

    public void insertReadBook(NowLoginStudentDB nls) {

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

    public void deleteReadBookByStudentId(NowLoginStudentDB nls) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE  FROM now_login_student where tb_seria_number=('" + nls.getTbSeriaNumber() + "')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<NowLoginStudentDB> allReadBook() {

        List<NowLoginStudentDB> books = new ArrayList();
        connect();
        try {

            ps = conn.prepareStatement("select * from now_login_student");
            rs = ps.executeQuery();
            while (rs.next()) {
                NowLoginStudentDB student = new NowLoginStudentDB();
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
                uw.setFatherName(rs.getString("father_name"));
                uw.setAge(rs.getString("age"));

                uw.setWorkerCode(rs.getString("worker_code"));
                uw.setPassword(rs.getString("password"));
                uw.setePoct(rs.getString("e_poct"));
                uw.setMobuilNumber(rs.getString("mobil_number"));
                workers.add(uw);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return workers;

    }

    public void insertBuyBook(BuyBook book) {

        connect();

        try {
            ps = conn.prepareStatement("insert into buy_book values(0,?,?,?,?)");
            ps.setString(1, book.getName());
            ps.setString(2, book.getSurname());

            ps.setString(4, book.getBook_name());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            close();
        }

    }

    public void deleteBuyBookByBookName(BuyBook book) {

        connect();
        try {
            ps = conn.prepareStatement("DELETE  FROM buy_book where book_name=('" + book.getBook_name() + "')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<BuyBook> allBuyBook() {

        List<BuyBook> books = new ArrayList();
        connect();
        try {

            ps = conn.prepareStatement("select * from buy_book");
            rs = ps.executeQuery();
            while (rs.next()) {
                BuyBook book = new BuyBook();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setSurname(rs.getString("surname"));
                book.setBook_name(rs.getString("book_name"));

                books.add(book);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return books;

    }

}
