import {test, expect} from "@playwright/test";

test("has the right title", async ({ page }) => {
    // Go to a web page
    await page.goto("https://training-support.net");

    //Check if title is correct
    await expect(page).toHaveTitle("Training Support");
});