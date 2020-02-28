
package com.test.consumerest.Controllers;

import com.test.consumerest.Models.QuoteDTO;
import com.test.consumerest.Service.ConsumerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeRestController {
    
    @Autowired
    private ConsumerServiceImpl service;

    @GetMapping(value="/getquote")
    public QuoteDTO getquote() {
        return service.getQuote();
    }

    // @RequestMapping(method = RequestMethod.PUT)
    // public String update(@RequestParam Long id, TaskDTO task) {
    //     service.update(id, task);
    //     return "redirect:/";
    // }

    // @RequestMapping(method = RequestMethod.DELETE)
    // public String delete(@RequestParam Long id) {
    //     service.delete(id);
    //     return "redirect:/";
    // }

    // @RequestMapping(method = RequestMethod.POST)
    // public String create(@Valid @ModelAttribute("newTask") TaskDTO task) {
    //     service.create(task);
    //     return "redirect:/";
    // }
}