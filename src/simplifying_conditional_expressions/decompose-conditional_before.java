boolean isSummer(Date date) {
    return date.after(SUMMER_START) && date.before(SUMMER_END);
        }
if (!isSummer(date)) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}