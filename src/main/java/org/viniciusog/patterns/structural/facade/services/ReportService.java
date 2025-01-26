package org.viniciusog.patterns.structural.facade.services;

import org.viniciusog.patterns.structural.facade.model.Card;
import org.viniciusog.patterns.structural.facade.model.Register;

import java.util.List;

public class ReportService {

    private RegisterService registerService;

    public ReportService(RegisterService registerService) {
        this.registerService = registerService;
    }

    public void getSummary(Card card) {
        List<Register> registers = registerService.getRegistersByCard(card);
        if (registers == null) return;
        for (Register register : registers) {
            System.out.printf("""
                    %s
                    %.2f
                    %s
                    
                    """, register.getStoreName(),
                    register.getValue(),
                    register.getDate().toString());
        }
    }
}
