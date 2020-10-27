package com.Controller;

import com.Utils.ResponseUtils;
import com.entity.Address;
import com.mapper.AddressMapper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ControllerAddress")
public class AddressController extends HttpServlet {
    AddressMapper mapper;
    AddressController(SqlSession sqlSession){
        mapper = sqlSession.getMapper(AddressMapper.class);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String id = req.getParameter("id");
         int uid = Integer.parseInt(id);

        List<Address> list = mapper.SelectAddress(uid);

        System.out.println(list);
        ResponseUtils.responseToJson(resp,list);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
