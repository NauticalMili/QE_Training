import { test, expect } from "@playwright/test";

test("has the right title", async ({ page }) => {
    // Go to a web page
    await page.goto("https://training-support.net/webelements/target-practice");
    const title = await page.title();
    console.log(title);
    console.log (await page.locator(".bg-cyan-200").textContent());
    console.log(await page.getByText("Heading #6").getAttribute('class'));
    console.log(await page.getByRole('heading', { name: 'Heading #5' }).evaluate(e1 => getComputedStyle(e1).color));
    console.log(await page.getByRole('button', { name: 'Pink'}).boundingBox());
});