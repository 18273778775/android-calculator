# Android 计算器应用

一个功能完整的Android计算器应用，支持基本四则运算和高级功能。

## 🎯 功能特性

- ✅ **基本运算**: 加法(+)、减法(-)、乘法(×)、除法(÷)
- ✅ **小数支持**: 支持小数点运算
- ✅ **负数运算**: 支持负数计算
- ✅ **连续计算**: 支持连续运算操作
- ✅ **清除功能**: 一键清除(C)重置计算器
- ✅ **错误处理**: 智能处理除零等错误情况
- ✅ **现代界面**: Material Design设计风格
- ✅ **中文支持**: 完整中文本地化

## 📱 技术规格

- **最低支持**: Android 5.0 (API 21)
- **目标版本**: Android 14 (API 34)
- **应用包名**: com.example.calculator
- **版本号**: 1.0
- **界面语言**: 中文
- **架构**: MVVM模式

## 🚀 快速开始

### 方法1: 下载预构建APK (推荐)

1. 访问 [Releases页面](../../releases)
2. 下载最新版本的 `app-debug.apk`
3. 在Android设备上安装APK

### 方法2: 使用Android Studio构建

1. 克隆项目到本地:
   ```bash
   git clone <repository-url>
   cd calculator-android
   ```

2. 使用Android Studio打开项目

3. 等待Gradle同步完成

4. 点击 `Build → Build Bundle(s) / APK(s) → Build APK(s)`

5. APK文件将生成在: `app/build/outputs/apk/debug/app-debug.apk`

### 方法3: 命令行构建

确保已安装Android SDK和Java JDK 8+:

```bash
# Windows
gradlew.bat assembleDebug

# Linux/Mac
./gradlew assembleDebug
```

## 🏗️ 项目结构

```
calculator-android/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/calculator/
│   │   │   ├── MainActivity.java      # 主活动
│   │   │   └── Calculator.java        # 计算器逻辑
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml  # 主界面布局
│   │   │   ├── values/
│   │   │   │   ├── strings.xml        # 字符串资源
│   │   │   │   ├── colors.xml         # 颜色定义
│   │   │   │   └── themes.xml         # 主题样式
│   │   │   └── drawable/              # 图标资源
│   │   └── AndroidManifest.xml        # 应用清单
│   └── build.gradle                   # 应用构建配置
├── gradle/wrapper/                    # Gradle包装器
├── build.gradle                       # 项目构建配置
├── settings.gradle                    # 项目设置
└── README.md                          # 项目说明
```

## 🎨 界面设计

### 颜色方案
- **数字按钮**: 灰色 (#95a5a6)
- **运算符按钮**: 青色 (#4ecdc4)  
- **等号按钮**: 蓝色 (#45b7d1)
- **清除按钮**: 红色 (#ff6b6b)
- **显示屏**: 白色背景，深色文字

### 布局特点
- 响应式设计，适配不同屏幕尺寸
- 大按钮设计，便于触摸操作
- 清晰的视觉层次和颜色区分
- Material Design设计规范

## 🔧 开发环境

### 必需工具
- Android Studio 4.0+
- Java JDK 8+
- Android SDK (API 21+)
- Gradle 8.0+

### 推荐工具
- Git版本控制
- Android设备或模拟器用于测试

## 📦 构建配置

### Debug版本
- 包含调试信息
- 使用调试签名
- 适用于开发和测试

### Release版本
- 代码优化和混淆
- 需要发布签名
- 适用于正式发布

## 🤝 贡献指南

欢迎提交Issue和Pull Request来改进这个项目！

### 开发流程
1. Fork项目
2. 创建功能分支
3. 提交更改
4. 创建Pull Request

### 代码规范
- 遵循Java编码规范
- 添加适当的注释
- 保持代码简洁清晰

## 📄 许可证

本项目采用MIT许可证 - 查看 [LICENSE](LICENSE) 文件了解详情

## 🆘 支持

如果遇到问题或有建议，请：
1. 查看 [Issues页面](../../issues)
2. 创建新的Issue描述问题
3. 提供详细的错误信息和设备信息

## 📝 更新日志

### v1.0 (2025-01-08)
- ✨ 初始版本发布
- ✅ 实现基本四则运算
- ✅ 添加Material Design界面
- ✅ 支持小数和负数运算
- ✅ 添加错误处理机制

---

**享受使用这个计算器应用！** 🎉