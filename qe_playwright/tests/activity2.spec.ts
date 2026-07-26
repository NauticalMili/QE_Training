import { test, expect } from "@playwright/test";

test("has the right title", async ({ page }) => {
    // Go to a web page
    await page.goto("https://training-support.net/webelements/simple-form");
    const title = await page.title();
    console.log(title);
    await page.locator("#full-name").fill("Milind");
    await page.locator("#email").fill("milind.nautiyal@gmail.com");
    await page.getByTestId("event-date").pressSequentially("20012003");
    await page.locator("#additional-details").fill("Hello, its me, Milind.");

    await page.getByRole('button', { name: 'Submit' }).click();

    const confirmation = page.locator('#action-confirmation');

    await expect(confirmation).toBeVisible();
    console.log(await confirmation.textContent());
});