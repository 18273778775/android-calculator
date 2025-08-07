@echo off
echo ========================================
echo    Android计算器项目 - GitHub上传脚本
echo ========================================
echo.

echo 请确保你已经：
echo 1. 在GitHub上创建了新仓库
echo 2. 安装了Git工具
echo 3. 配置了Git用户信息
echo.

set /p repo_url="请输入GitHub仓库URL (例如: https://github.com/username/android-calculator.git): "

if "%repo_url%"=="" (
    echo 错误：仓库URL不能为空
    pause
    exit /b 1
)

echo.
echo 开始上传项目到GitHub...
echo.

echo 1. 初始化Git仓库...
git init

echo 2. 添加远程仓库...
git remote add origin %repo_url%

echo 3. 添加所有文件...
git add .

echo 4. 创建初始提交...
git commit -m "Initial commit - Android Calculator App

Features:
- Basic arithmetic operations (+, -, ×, ÷)
- Decimal number support
- Negative number support
- Continuous calculation
- Clear function
- Division by zero error handling
- Material Design UI
- Chinese localization

Technical specs:
- Min SDK: Android 5.0 (API 21)
- Target SDK: Android 14 (API 34)
- Package: com.example.calculator
- Version: 1.0"

echo 5. 推送到GitHub...
git branch -M main
git push -u origin main

if %errorlevel% equ 0 (
    echo.
    echo ========================================
    echo           上传成功！
    echo ========================================
    echo.
    echo 项目已成功上传到GitHub！
    echo.
    echo 接下来：
    echo 1. 访问你的GitHub仓库
    echo 2. 点击 "Actions" 标签查看构建进度
    echo 3. 构建完成后在 "Artifacts" 下载APK文件
    echo 4. 或者在 "Releases" 页面下载发布版本
    echo.
    echo 预计构建时间：5-10分钟
    echo.
) else (
    echo.
    echo ========================================
    echo           上传失败！
    echo ========================================
    echo.
    echo 可能的原因：
    echo 1. 仓库URL不正确
    echo 2. 没有推送权限
    echo 3. 网络连接问题
    echo 4. Git配置问题
    echo.
    echo 请检查错误信息并重试
    echo.
)

pause