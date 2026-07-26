import { test, expect } from "@playwright/test";


test("has the right title", async ({ page }) => {
    // Go to a web page
    await page.goto("https://training-support.net/webelements/drag-drop");
    const title = await page.title();
    console.log(title);
    
    const ball = page.getByTestId("ball");
    const dropzone1 = page.getByTestId("dropzone1");
    const dropzone2 = page.getByTestId("dropzone2");

    await ball.dragTo(dropzone1);
    await expect(dropzone1).toHaveText("Dropped!");

    await ball.dragTo(dropzone2);
    await expect(dropzone2).toHaveText("Dropped!");
}); 