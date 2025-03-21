package org.example.btvn_buoi2.controller;

import org.example.btvn_buoi2.models.Employees;
import org.example.btvn_buoi2.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class homecotronller {

    @Autowired
    private EmployeesRepository employeesRepository;

    @GetMapping({"/", ""})
    public String home() {
        return "redirect:/employees/select";
    }

    @GetMapping("/select")
    public String select(Model model) {
        List<Employees> employees = employeesRepository.findAll();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping("/insert")
//    @PostMapping("/insert")
    public String insert(@ModelAttribute Employees employees) {
        employeesRepository.save(employees);
        return "redirect:/employees/select";
    }

    @PostMapping("/deleteAll")
//    @DeleteMapping("/deleteAll")
    public String deleteAll(@RequestParam(required = false) List<Integer> ids) {
        if (ids != null && !ids.isEmpty()) {
            employeesRepository.deleteAllById(ids);
        }
        return "redirect:/employees/select";
    }

    @GetMapping("/edit")
//    @PutMapping("/edit")
    public String edit(@RequestParam String id, RedirectAttributes attributes) {
        Optional<Employees> optionalEmployee = employeesRepository.findById(Integer.parseInt(id));
        if (optionalEmployee.isPresent()) {
            attributes.addFlashAttribute("employeesByID", optionalEmployee.get());
        } else {
            attributes.addFlashAttribute("errorMessage", "Không tìm thấy nhân viên có ID: " + id);
        }
        return "redirect:/employees/select";
    }

    @GetMapping("/update")
//    @PutMapping("/update")
    public String update(@ModelAttribute Employees employees) {
        if (employeesRepository.existsById(employees.getId())) {
            employeesRepository.save(employees);
        }
        return "redirect:/employees/select";
    }

    @GetMapping(value="/delete")
//    @DeleteMapping(value="/delete")
    public String delete(@RequestParam String id){
        Employees employees = new Employees();
        employees.setId(Integer.parseInt(id));
        employeesRepository.delete(employees);
        return "redirect:/employees/select";
    }
}
