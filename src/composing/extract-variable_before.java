void renderBanner() {
    final boolean thereIsMAC = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean thereIsIE = browser.toUpperCase().indexOf("IE") > -1;
    final boolean resizeExist = resize > 0;

  if thereIsMac && thereIsIE && wasInicialized() && resizeExist) {
    // do something
  }
}