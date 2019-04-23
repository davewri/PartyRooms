package ie.ulster.exam.controllers;

import ie.ulster.exam.dao.RoomDao;
import ie.ulster.exam.dto.BookingDto;
import ie.ulster.exam.models.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ApplicationController {

    @Autowired
    private RoomDao roomDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {

        // add name and its value to the view model object
        model.addAttribute("name", name);

        //Load and return the index view
        return "index";
    }

    @RequestMapping(value = "/partyRooms", method = RequestMethod.GET)
    public String rooms(Model model) {

        List<Rooms> rooms;

        rooms = roomDao.findAll();
        model.addAttribute("partyRooms", rooms);

        // add empty room to the model
        model.addAttribute("room", new Rooms());

        model.addAttribute("errorRoomName", false);
        model.addAttribute("errorChildrenAttending", false);

        return "partyRooms";
    }

    @RequestMapping(value = "/partyRooms", method = RequestMethod.POST)
    public String rooms(Model model, BookingDto booking) {
        List<Rooms> rooms;

        rooms = roomDao.findAll();
        model.addAttribute("partyRooms", rooms);

        // add empty room to the model
        model.addAttribute("room", new Rooms());

        if(!booking.validate()) {
            model.addAttribute("errors", booking.getErrors());
        }

        System.out.println(booking);

        return "partyRooms";

    }

}
