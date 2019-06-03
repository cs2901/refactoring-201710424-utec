void renderBanner() {
    const bool thereIsMAC = platform.toUpperCase().indexOf("MAC") > -1;
    const bool thereIsIE = browser.toUpperCase().indexOf("IE") > -1;
    const bool resizeExist = resize > 0;

  if thereIsMac && thereIsIE && wasInicialized() && resizeExist) {
    // do something
  }
}