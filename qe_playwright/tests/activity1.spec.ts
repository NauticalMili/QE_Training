import { test, expect } from "@playwright/test";

test("has the right title", async ({ page }) => {
    // Go to a web page
    await page.goto("https://training-support.net");
    const title = await page.title();
    console.log(title);
    await expect(page).toHaveTitle("Training Support");

    await page.getByRole("link", { name: "About Us" }).click();

    await page.waitForURL("**/about/");

    const title2 = await page.title();
    console.log("Second Title: " + title2);
});