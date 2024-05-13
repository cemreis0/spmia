package com.thoughtmechanix.licensingservice.services;

import com.thoughtmechanix.licensingservice.config.ServiceConfig;
import com.thoughtmechanix.licensingservice.model.License;
import com.thoughtmechanix.licensingservice.repository.LicenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LicenseService {
    private final LicenseRepository licenseRepository;
    private final ServiceConfig serviceConfig;

    public License getLicense(String organizationId, String licenseId) {
        System.out.println(serviceConfig.getExampleProperty());
        return licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
    }

    public List<License> getLicensesByOrg(String organizationId){
        System.out.println(serviceConfig.getExampleProperty());
        return licenseRepository.findByOrganizationId( organizationId );
    }

    public void saveLicense(License license){
        System.out.println(serviceConfig.getExampleProperty());
        license.setLicenseId(UUID.randomUUID().toString());
        licenseRepository.save(license);
    }

    public void updateLicense(License license){
        System.out.println(serviceConfig.getExampleProperty());
        licenseRepository.save(license);
    }

    public void deleteLicense(License license){
        System.out.println(serviceConfig.getExampleProperty());
        licenseRepository.delete(license);
    }
}
