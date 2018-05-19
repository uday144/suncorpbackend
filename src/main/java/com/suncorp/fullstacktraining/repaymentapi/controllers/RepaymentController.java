package com.suncorp.fullstacktraining.repaymentapi.controllers;

import com.suncorp.fullstacktraining.repaymentapi.models.Loans;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RepaymentController {

    @RequestMapping("/getsLoans")
    public List<Loans> getAllLoans()
    {
      return Arrays.asList(
             new Loans("Car", "Car Loan"),
             new Loans("Home", "Home Loan"),
              new Loans("Bike", "Bikes Loan")

      );
    }
}
