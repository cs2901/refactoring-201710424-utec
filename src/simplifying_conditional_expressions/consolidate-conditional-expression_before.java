double disabilityAmount() {
    boolean isNotEligableForDisability() {
      return seniority < 2 || monthsDisabled > 12 || isPartTime;
    }
    if (isNotEligableForDisability()) {
        return 0;
    }
    // Compute the disability amount.
    // ...
}