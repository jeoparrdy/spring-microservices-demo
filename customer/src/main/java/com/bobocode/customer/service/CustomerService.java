package com.bobocode.customer.service;

import com.bobocode.customer.entity.Customer;
import com.bobocode.customer.repository.CustomerRepository;
import com.bobocode.customer.service.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);
    }
}
