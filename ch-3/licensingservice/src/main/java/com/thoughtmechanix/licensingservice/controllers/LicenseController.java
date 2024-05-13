package com.thoughtmechanix.licensingservice.controllers;

import com.thoughtmechanix.licensingservice.config.ServiceConfig;
import com.thoughtmechanix.licensingservice.model.License;
import com.thoughtmechanix.licensingservice.services.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
@RequiredArgsConstructor
public class LicenseController {
    private final LicenseService licenseService;
    private final ServiceConfig serviceConfig;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<License> getLicenses(@PathVariable("organizationId") String organizationId) {
        System.out.println(serviceConfig.getExampleProperty());
        return licenseService.getLicensesByOrg(organizationId);
    }

    @RequestMapping(value="/{licenseId}", method = RequestMethod.GET)
    public License getLicenses(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId) {
        return licenseService.getLicense(organizationId,licenseId);
    }

    @RequestMapping(value="{licenseId}", method = RequestMethod.PUT)
    public String updateLicenses( @PathVariable("licenseId") String licenseId) {
        return "Updated license";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String saveLicenses(@RequestBody License license) {
        licenseService.saveLicense(license);
        return "Saved license";
    }

    @RequestMapping(value="{licenseId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses( @PathVariable("licenseId") String licenseId) {
        return "Deleted license";
    }
}
